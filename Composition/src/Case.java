public class Case {
   private String model;
   private String manufacturer;
   private int powersupply;
   private DimensionsOfCase dimensionofcase;

   public String getModel() {
      return model;
   }
   public String getManufacturer() {
      return manufacturer;
   }
   public int getPowersupply() {
      return powersupply;
   }
   public DimensionsOfCase getDimensionofcase() {
      return dimensionofcase;
   }
   public Case(String model, String manufacturer, int powersupply, DimensionsOfCase dimensionofcase){
      this.model=model;
      this.manufacturer=manufacturer;
      this.powersupply=powersupply;
      this.dimensionofcase=dimensionofcase;
   }
   public void pressPowerButton()
   {
      System.out.println("Power button pressed");
   }
}
