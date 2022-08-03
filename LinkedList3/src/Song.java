public class Song {
    private String songName;
    private int duration;
    public Song(String songName,int duration)
    {
        this.songName=songName;
        this.duration=duration;
    }
    public String getSongName()
    {
        return this.songName;
    }
    @Override
    public String toString()
    {
        return this.songName+" : "+this.duration;
    }
}

