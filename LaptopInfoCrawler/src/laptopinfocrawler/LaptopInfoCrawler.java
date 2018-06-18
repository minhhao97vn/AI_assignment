/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopinfocrawler;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author minhh
 */
public class LaptopInfoCrawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "E:\\hk172\\AI\\btl\\chromedriver.exe");
        WebDriver crawler = new ChromeDriver();
        
        
        PhongVuLaptopCrawler obj = new PhongVuLaptopCrawler();
        obj.crawling(crawler);
    }
    
}
