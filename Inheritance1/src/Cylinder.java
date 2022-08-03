public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius,double height)
    {
        super(radius);
        this.height=height;
        //super.radius=15; due to this use private variable
    }
    public double getVolume()
    {
        return height*super.Area();
    }
    public static void main(String[] args)
    {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.Area());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.area= " + cylinder.Area());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
