public class Runner {
    public static void main (String[] args)
    {
        Car car=new Ciaz();
        System.out.println(car.legRoom()+", "+car.getCategory()+", "+car.getColour()+", "+car.getManufacturer());
        Car car1=new Car("default","default","default");
        System.out.println(car1.legRoom()+", "+car1.getCategory()+", "+car1.getColour()+", "+car1.getManufacturer());
    }
}
