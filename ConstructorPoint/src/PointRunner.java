public class PointRunner {
    public static void main(String[] args)
    {
        Point p1 = new Point(6, 5);
        Point p2 = new Point(3, 1);
        System.out.println(p1.distance());
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(3,3));
        Point p=new Point();
        System.out.println(p.distance());
    }
}
