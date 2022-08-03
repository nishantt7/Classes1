public class Motherboard {
    private String model;
    private int ramslots;
    private String manufacturer;
    private int cardslots;
    private String bios;

    public String getModel() {
        return model;
    }
    public int getRamslots() {
        return ramslots;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getCardslots() {
        return cardslots;
    }
    public String getBios() {
        return bios;
    }
    public Motherboard(String model, int ramslots, String manufacturer, int cardslots, String bios) {
        this.model = model;
        this.ramslots = ramslots;
        this.manufacturer = manufacturer;
        this.cardslots = cardslots;
        this.bios = bios;
    }
    public void loadProgram(String programName)
    {
        System.out.println("Program" + programName+ "has been loaded....");
    }
}

