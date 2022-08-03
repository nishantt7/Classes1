public class Dog extends Animal{
    String breed;
    int legs;
    public Dog()
    {
        this("Beigel"); //used to call another constructor from one constructor
        System.out.println(breed);
        System.out.println(super.legs);
        System.out.println(legs);
    }
    public Dog(String breed)
    {
        //super() will be called by JVM itself as first line of every constructor should be super() or this()
        super.legs=4;
        this.breed=breed;
        System.out.println("child class constructor");
    }
    public static void main (String[] args)
    {
        Dog d=new Dog("abc");
        Dog d1=new Dog ();
    }
}
