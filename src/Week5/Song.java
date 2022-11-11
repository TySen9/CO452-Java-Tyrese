package Week5;

//This creates the song class and gives it the ability to hold the variables needed for the array in song list.
public class Song {

    private String title;

    private String artist;

    private int playCount;

    public Song(String title, String artistname, int count)
    {
        this.title = title;
        this.artist = artistname;
        this.playCount = count;
    }

    public void print()
    {
        System.out.println(title+ " " +artist + " " + playCount);
    }

    public String getTitle()
    {
        return title;
    }

    public int getPlayCount()
    {
        return playCount;
    }
    
}
