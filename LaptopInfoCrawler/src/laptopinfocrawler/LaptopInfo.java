/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopinfocrawler;

/**
 *
 * @author minhh
 */
public class LaptopInfo {

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public String getCpuGen() {
        return cpuGen;
    }

    public void setCpuGen(String cpuGen) {
        this.cpuGen = cpuGen;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public int getNumCore() {
        return numCore;
    }

    public void setNumCore(int numCore) {
        this.numCore = numCore;
    }

    public float getCpuClock() {
        return cpuClock;
    }

    public void setCpuClock(float cpuClock) {
        this.cpuClock = cpuClock;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(float displaySize) {
        this.displaySize = displaySize;
    }

    public boolean isIsTouchable() {
        return isTouchable;
    }

    public void setIsTouchable(boolean isTouchable) {
        this.isTouchable = isTouchable;
    }

    public String getDisplayRes() {
        return displayRes;
    }

    public void setDisplayRes(String displayRes) {
        this.displayRes = displayRes;
    }

    public String getIntegratedGraphicCard() {
        return integratedGraphicCard;
    }

    public void setIntegratedGraphicCard(String integratedGraphicCard) {
        this.integratedGraphicCard = integratedGraphicCard;
    }

    public String getRenderGraphicCard() {
        return renderGraphicCard;
    }

    public void setRenderGraphicCard(String renderGraphicCard) {
        this.renderGraphicCard = renderGraphicCard;
    }

    public int getVgaMem() {
        return vgaMem;
    }

    public void setVgaMem(int vgaMem) {
        this.vgaMem = vgaMem;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public boolean isHasOpticalDisk() {
        return hasOpticalDisk;
    }

    public void setHasOpticalDisk(boolean hasOpticalDisk) {
        this.hasOpticalDisk = hasOpticalDisk;
    }

    public boolean isHasNumkeyboard() {
        return hasNumkeyboard;
    }

    public void setHasNumkeyboard(boolean hasNumkeyboard) {
        this.hasNumkeyboard = hasNumkeyboard;
    }

    public boolean isHasWebcam() {
        return hasWebcam;
    }

    public void setHasWebcam(boolean hasWebcam) {
        this.hasWebcam = hasWebcam;
    }

    public int getNumUsbPort() {
        return numUsbPort;
    }

    public void setNumUsbPort(int numUsbPort) {
        this.numUsbPort = numUsbPort;
    }

    public int getNumHdmiPort() {
        return numHdmiPort;
    }

    public void setNumHdmiPort(int numHdmiPort) {
        this.numHdmiPort = numHdmiPort;
    }

    public boolean isHasLanPort() {
        return hasLanPort;
    }

    public void setHasLanPort(boolean hasLanPort) {
        this.hasLanPort = hasLanPort;
    }

    public boolean isHasVgaPort() {
        return hasVgaPort;
    }

    public void setHasVgaPort(boolean hasVgaPort) {
        this.hasVgaPort = hasVgaPort;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getNumPinCell() {
        return numPinCell;
    }

    public void setNumPinCell(int numPinCell) {
        this.numPinCell = numPinCell;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMainPurpose() {
        return mainPurpose;
    }

    public void setMainPurpose(String mainPurpose) {
        this.mainPurpose = mainPurpose;
    }
    private String laptopName = null;
    private String brandName = null;
    private String cpuType = null;
    private String cpuGen = null;
    private String cpuModel = null;
    private int numCore;
    private float cpuClock;
    private int cache;
    private int ram;
    private String os;
    private float displaySize;
    private boolean isTouchable;
    private String displayRes = null;
    private String integratedGraphicCard = null;
    private String renderGraphicCard = null;
    private int vgaMem;
    private int hdd;
    private int ssd;
    private boolean hasOpticalDisk;
    private boolean hasNumkeyboard;
    private boolean hasWebcam;
    private int numUsbPort;
    private int numHdmiPort;
    private boolean hasLanPort;
    private boolean hasVgaPort;
    private float weight;
    private int numPinCell;
    private int price;
    private String mainPurpose = null;
    private String ref = null;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
