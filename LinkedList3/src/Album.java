import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    String artist;
    String albumName;
    List<Song> songs = new ArrayList<Song>();
    public Album(String artist, String albumName)
    {
        this.artist = artist;
        this.albumName = albumName;
    }
    public void addSong(String songName, int duration)
    {
        if (findSong(songName) == null) {
            this.songs.add(new Song(songName, duration));
        } else {
            System.out.println("Song is not in the album");
        }
    }
    public Song findSong(String songName)
    {
        for (Song song : this.songs) {
            if (song.getSongName().equals(songName)) {
                return song;
            }
        }
        return null;
    }
    public void addToPlayList(String songName, LinkedList<Song> playList)
    {
        Song playListSong = findSong(songName);
        if (playListSong != null)
        {
            playList.add(playListSong);
        }
    }
}
