public class Runner
{
    public static void main(String[] args)
    {
            Movie movie = randomMovie();
            System.out.println(movie.getMovieName() + "\n" + movie.plot());

            Movie movie1=new Movie("abc"); //parent reference and parent object
            System.out.println(movie1.getMovieName());
            System.out.println(movie1.plot());

            Jaws jaw=new Jaws(); //child reference and child object
            System.out.println(jaw.getMovieName());
            System.out.println(jaw.plot());
            System.out.println(jaw.jawsOwnMethod());

            Movie movie2=new Jaws(); //parent reference and child object
            System.out.println(movie2.getMovieName());
            System.out.println(movie2.plot());

            Movie movie3=new KGF2(); //parent reference and child object
            System.out.println(movie3.getMovieName());
            System.out.println(movie3.plot());
    }
    public static Movie randomMovie()
    {
        int randomNumber=(int)Math.random()*5+1;
        switch(randomNumber)
        {
            case 1:
                return new Independence();
            case 2:
                return new Jaws();
            case 3:
                return new Runway34();
            case 4:
                return new KGF2();
        }
        return null;
    }
}
