public class Circle {
    //public double radius;
    private double radius;
    private double area;
    public Circle(double radius)
    {
        if(radius<0)
        {
            this.radius=0;
        }
        else
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double Area()
    {
        return radius*radius*Math.PI;
    }
}
