public class Car {
    private boolean engine;
    private String colour;
    private String manufacturer;
    private String category;
    public Car(String colour,String manufacturer,String category){
        this.colour=colour;
        this.manufacturer=manufacturer;
        this.category=category;
        this.engine=true;
    }
    public String getColour()
    {
        return "colour is " + this.colour;
    }
    public String getManufacturer()
    {
        return "manufacturer is " + this.manufacturer;
    }
    public String getCategory()
    {
        return "category is " + this.category;
    }
    public String legRoom()
    {
        return "Default legRoom";
    }
}
