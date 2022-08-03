public class Movie
{
    //public String movieName;
    private String movieName;
    public Movie()
    {

    }
    public Movie(String movieName)
    {
        this.movieName = movieName;
    }
    public String plot()
    {
        return ("parent class plot");
    }
    public String getMovieName()
    {
        return movieName;
    }
}