/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopinfocrawler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *
 * @author minhh
 */
public class PhongVuLaptopCrawler {

    public void crawling(WebDriver crawler) throws InterruptedException, IOException {
        crawler.get("https://phongvu.vn/laptop.cat");
        Iterator<WebElement> productIter;
        List<LaptopInfo> allProductList = new LinkedList<LaptopInfo>();
        String[] numProductTokens = crawler.findElement(By.className("tek-breadcrumb-count")).getText().split(" ");
        int numProduct = Integer.parseInt(numProductTokens[0].substring(1, numProductTokens[0].length()));

        System.out.println(numProduct);
        int countProduct = 0;
        int countPage = 1;
        while (countProduct < numProduct) {
            productIter = crawler.findElements(By.className("product-info")).iterator();
            while (productIter.hasNext()) {
                WebElement productEle = productIter.next();
                countProduct++;
                System.out.println(String.valueOf(countProduct) + ". " + productEle.findElement(By.className("product-name")).getAttribute("title"));
                String ref = productEle.findElement(By.className("add-to-compare-block")).getAttribute("data-product-url");
//                System.out.println(ref);
                LaptopInfo laptopInfo = new LaptopInfo();
                laptopInfo.setRef(ref);
                allProductList.add(laptopInfo);
            }
            countPage++;
            crawler.get("https://phongvu.vn/laptop.cat?p=" + countPage);
        }
        Iterator<LaptopInfo> allProductIter = allProductList.iterator();
        FileWriter writer = new FileWriter("laptop_data.csv");

        countProduct = 0;
        boolean key = true;
        while (allProductIter.hasNext()) {
            try {
                LaptopInfo laptopInfo = allProductIter.next();
                crawler.get(laptopInfo.getRef());

                if (key) {
                    Iterator<WebElement> keyList = crawler.findElements(By.className("attribute-label")).iterator();
                    StringBuilder sbt = new StringBuilder();
                    sbt.append("Tên").append(",");
                    sbt.append("Giá").append(",");
                    Iterator<WebElement> tempkeyList = keyList;
                    while (tempkeyList.hasNext()) {
                        WebElement keyElement = tempkeyList.next();
                        if (!keyElement.getText().equals("")) {
                            if (keyElement.getText().equals("Hỗ trợ VR")) {
                                sbt.append(keyElement.getText());
                            } else {
                                sbt.append(keyElement.getText()).append(",");
                            }
                        }
                    }
                    writer.write(sbt.toString() + "\n");
                    key = false;
                }

                StringBuilder sb = new StringBuilder();
                String productName = crawler.findElement(By.className("detail-product-name")).getText();
                String price = crawler.findElement(By.className("detail-product-final-price")).getText();
                sb.append(productName).append(",");
                sb.append(price).append(",");
                WebElement nextEle = crawler.findElement(By.className("product-attribute-view-detail"));
                JavascriptExecutor jse = (JavascriptExecutor) crawler;
                jse.executeScript("arguments[0].click()", nextEle);
                Iterator<WebElement> keyList = crawler.findElements(By.className("attribute-label")).iterator();
                Iterator<WebElement> valueList = crawler.findElements(By.className("attribute-value")).iterator();

                while (keyList.hasNext()) {
                    WebElement keyElement = keyList.next();
                    WebElement valueElement = valueList.next();
                    if (!keyElement.getText().equals("")) {
                        if (keyElement.getText().equals("Hỗ trợ VR")) {
                            sb.append(valueElement.getText());
                        } else {
                            sb.append(valueElement.getText()).append(",");
                        }
                    }
                }
                countProduct++;
                writer.write(sb.toString() + "\n");
                if (countProduct % 10 == 0) {
                    System.out.println("Added " + countProduct + " product");
                }
            } catch (NoSuchElementException | TimeoutException | ElementNotVisibleException e) {
                continue;
            }

        }
//        writer.flush();
        writer.close();
        crawler.close();

    }
}
