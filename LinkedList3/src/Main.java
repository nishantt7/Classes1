import java.util.*;

public class Main {
    private static List<Album> albums=new ArrayList<Album>();
    private static LinkedList<Song> playList=new LinkedList<Song>();
    public static void main(String[] args)
    {
        Album album1=new Album("artist1","album1");
        album1.addSong("song1",4);
        album1.addSong("song2",5);
        album1.addSong("song3",6);
        album1.addSong("song4",7);
        album1.addSong("song5",8);
        albums.add(album1);
        Album album2=new Album("artist1","album1");
        album2.addSong("song1",4);
        album2.addSong("song2",5);
        album2.addSong("song3",6);
        album2.addSong("song4",7);
        album2.addSong("song5",8);
        albums.add(album2);

        albums.get(0).addToPlayList("song1",playList);
        albums.get(0).addToPlayList("song2",playList);
        albums.get(0).addToPlayList("song3",playList);
        albums.get(1).addToPlayList("song4",playList);
        albums.get(1).addToPlayList("song5",playList);
        controlPlaylist();
    }
    public static void controlPlaylist()
    {
        ListIterator<Song> iterator=playList.listIterator();
        Scanner sc=new Scanner(System.in);
        boolean quit=false;
        boolean direction=true;
        while(!quit)
        {
            System.out.println("enter the option you want");
            int option=sc.nextInt();
            switch (option)
            {
                case 1:
                    if(direction==false)
                    {
                        if(iterator.hasNext()) {
                            iterator.next();
                        }
                        direction=true;
                    }
                    if(iterator.hasNext()) {
                        System.out.println("Now playing next song which is"+" "+iterator.next().toString());
                    }
                    else {
                        System.out.println("At the end of the list");
                    }
                    break;
                case 2:
                    if(direction==true)
                    {
                        if(iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        direction=false;
                    }
                    if(iterator.hasPrevious()) {
                        System.out.println("Now playing previous song which is" +" "+iterator.previous().toString());
                    }
                    else {
                        System.out.println("At the start of the list");
                    }
                    break;
                case 3:
                    printPlaylist();
            }
        }
    }
    public static void printPlaylist()
    {
        for (Song song:playList)
            System.out.println(song.toString());
    }
}

