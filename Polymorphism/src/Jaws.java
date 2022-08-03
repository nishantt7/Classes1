public class Jaws extends Movie
{
    @Override
    public String plot()
    {
        return ("Movie Jaws - Sharks eating all fishes");
    }
    public Jaws()
    {
        super("jaws");
        //test();
    }
    public String jawsOwnMethod()
    {
        return "Jaws Own Method";
    }
//    public void test(){
//        super.movieName="ABC";
//    }
}
