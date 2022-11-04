package Week5;
import java.util.ArrayList;

import helpers.*;

//This creates the array Songlist which will be used throughout as it is public
public class Songlist {

    private ArrayList<Song> songs;

    public Songlist()
    {
        songs = new ArrayList<Song>();
        addSomeSongs();
        doMainMenu();
    }

    
public void doMainMenu() 
{
   boolean wantToQuit = false;
   
   while(!wantToQuit)
   {
        displayMenu();
        int choice = InputReader.getInt("Please enter your choice > ");

        switch(choice)
        {
            case 1: addSong();break;
            case 2: deleteSong();break;
            case 3: printSongs(0);break;
            case 4: printtopSongs();break;
            case 5: wantToQuit = true; break;
        }
   }
}


private void displayMenu()
{
    System.out.println("\n 1. Add a Song");
    System.out.println(" 2. Delete a Song");
    System.out.println(" 3. Print All Songs");
    System.out.println(" 4. Print top Songs with highest play count");
    System.out.println(" 5. Quit\n");
}
//addSong allows for songs to be added to the array via asking the users input.
private void addSong()
{
    System.out.println(" Adding a new song");
    String title = InputReader.getString("Please enter the Song Name >");
    String name = InputReader.getString("Please enter the artist's name >");
    int count = InputReader.getInt("Please enter the number of plays for this song >");

    Song song = new Song(title, name, count);
    songs.add(song);
}
//deleteSong uses the find song first.
//Then deleting that specific song from the array. If it can't be found it will display an error message.
private void deleteSong()
{   
    printSongs(0);
    Song song = findSong();
    if(song != null){
        songs.remove(song);
    }
    else System.out.println("Song not found.");
    printSongs(0);
}
//This findSong is the part where for songs to be deleted by asking for the song name first,
//comparing and checking that with songs already in the array.
private Song findSong()
{
    String deleteConfirm = InputReader.getString("Enter the title of the Song you want to delete >");
    for(Song song : songs)
    {
        if(song.getTitle().contains(deleteConfirm))
            return song;
    } 
    return null;
}
//This prints the entire array out. In addition to this it works with printtopsongs to use the answer from that
//and compare it to the count for songs within the array and print all that are above the printtopsongs value.
private void printSongs(int count)
{
    System.out.println("\nPrinting All Songs\n");

    for(Song song : songs)
    {
        if(song.getPlayCount()>count)
            song.print();

    }
}
//This asks the user to input the count that they want to display songs that are above.
private void printtopSongs()
{
    int countAnswer = InputReader.getInt("Enter a playcount. This will display songs above that playcount > ");
    printSongs(countAnswer);
}
//This is to fill out the array with songs already.
private void addSomeSongs()
{
    Song song = new Song("4:00A.M.", "Taeko Onuki",45600813);
    songs.add(song);

    song = new Song("Resonance","Home", 140697602);
    songs.add(song);

    song = new Song("Bad Habit","Steve Lacy",340558048);
    songs.add(song);

    song = new Song("All I Need","Kid Travis",571390);
    songs.add(song);

    song = new Song("Damselfly","Loyle Carner",75783690);
    songs.add(song);

    song = new Song("Weather","Freddie Dread",66043686);
    songs.add(song);

    song = new Song("Simple And Clean","Hikaru Utada",18646893);
    songs.add(song);

    song = new Song("Blu Moon","THEY.",2203437);
    songs.add(song);

    song = new Song("Stalking","1nonly (feat. Shady Moon)",6133285);
    songs.add(song);

    song = new Song("Nobody But You","Soder (feat. Jorja Smith",74753306);
    songs.add(song);
}

}
