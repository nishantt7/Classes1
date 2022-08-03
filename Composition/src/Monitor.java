//has-a relationship
public class Monitor {
    private String brand;
    private String model;
    private int size;
    private ResolutionOfMonitor resolution;

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getSize() {
        return size;
    }
    public ResolutionOfMonitor getResolution() {
        return resolution;
    }
    public Monitor(String brand,String model,int size,ResolutionOfMonitor resolution) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
    }
    public void drawPixelAt(int x,int y, String color) {
        System.out.println("Pixel drwan at " + x + "" + y + "" + color);
    }
}
