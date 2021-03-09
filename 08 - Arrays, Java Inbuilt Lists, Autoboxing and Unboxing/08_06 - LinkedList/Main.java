import java.util.*;

public class Main
{
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Album> albumList = new ArrayList<Album>();
    private static LinkedList<Song> playList = new LinkedList<Song>();
    
    public static void main(String[] args)
    {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addTrack("Stormbringer", 4.6);
        album.addTrack("Love don't mean a thing", 4.22);
        album.addTrack("Holy man", 4.3);
        album.addTrack("Hold on", 5.6);
        album.addTrack("Lady double dealer", 3.21);
        album.addTrack("You can't do it right", 6.23);
        album.addTrack("High ball shooter", 4.27);
        album.addTrack("The gypsy", 4.2);
        album.addTrack("Soldier of fortune", 3.13);
        albumList.add(album);
        
        album = new Album("For those about to rock", "AC/DC");
        album.addTrack("For those about to rock", 5.44);
        album.addTrack("I put the finger on you", 3.25);
        album.addTrack("Lets go", 3.45);
        album.addTrack("Inject the venom", 3.33);
        album.addTrack("Snowballed", 4.51);
        album.addTrack("Evil walks", 3.45);
        album.addTrack("C.O.D.", 5.25);
        album.addTrack("Breaking the rules", 5.32);
        album.addTrack("Night of the long knives", 5.12);
        albumList.add(album);
        
        albumList.get(0).addToPlaylist("You can't do it right", playList);
        albumList.get(0).addToPlaylist("Holy man", playList);
        albumList.get(0).addToPlaylist("Speed king", playList);  // Does not exist
        albumList.get(0).addToPlaylist(9, playList);
        albumList.get(1).addToPlaylist(3, playList);
        albumList.get(1).addToPlaylist(2, playList);
        albumList.get(1).addToPlaylist(24, playList);  // There is no track 24
        
        play(playList);
    }
    
    private static void play(LinkedList<Song> playList)
    {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0)
        {
            System.out.println("No songs are in the playlist");
        }
        else
        {
            System.out.println("Now playing: " + listIterator.next().toString());
        }
        
        while (!quit)
        {
            int action = scanner.nextInt();
            scanner.nextLine();
            
            switch (action)
            {
                case 0:
                    System.out.println("Playlist finished");
                    quit = true;
                    break;
                case 1:
                    if (!forward)
                    {
                        if (listIterator.hasNext())
                        {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext())
                    {
                        System.out.println("Now playing: " + listIterator.next().toString());
                    }
                    else
                    {
                        System.out.println("End of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward)
                    {
                        if (listIterator.hasPrevious())
                        {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious())
                    {
                        System.out.println("Now playing: " + listIterator.previous().toString());
                    }
                    else
                    {
                        System.out.println("Start of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Replaying: " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("At the start of the playlist");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Replaying: " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("At the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
            
        }
    }
    
    private static void printMenu()
    {
        System.out.println(
                "0: Quit\n" + "1: Next Song\n" + "2: Previous Song\n" + "3: Repeat Song\n" + "4: Show Playlist\n" +
                "5: Display Menu");
    }
    
    private static void printList(LinkedList<Song> playList)
    {
        Iterator<Song> iterator = playList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }
    }
    
    
    
}
