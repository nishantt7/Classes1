public class Runner {
    public static void main (String[] args)
    {
//        DimensionsOfCase dimensionsOfCase=new DimensionsOfCase(10,20,30);
//        Case theCase =new Case("DELL","Dell",20,dimensionsOfCase);
        Case theCase =new Case("DELL","Dell",20,new DimensionsOfCase(10,20,30));
        Monitor theMonitor=new Monitor("Compaq","17inch",10,new ResolutionOfMonitor(15,30));
        Motherboard motherboard=new Motherboard("Intel",3,"Intel",4,"BIOS");
        PC pc=new PC(theCase,theMonitor,motherboard);
        pc.getTheMonitor().drawPixelAt(1,2,"red");
        pc.getTheMonitor().getResolution().resolutionMethod();
        pc.getTheCase().getDimensionofcase().getHeight();
        pc.getMotherboard().getBios();
    }
}
