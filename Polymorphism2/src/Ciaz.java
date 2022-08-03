public class Ciaz extends Car{
    public Ciaz()
    {
        super("red","Maruti","Sedan");
    }
    @Override
    public String legRoom()
    {
        return "Leg room is huge in ciaz";
    }
    public void ciazOwnMethod()
    {
        System.out.println("Ciaz's own method");
    }
}
