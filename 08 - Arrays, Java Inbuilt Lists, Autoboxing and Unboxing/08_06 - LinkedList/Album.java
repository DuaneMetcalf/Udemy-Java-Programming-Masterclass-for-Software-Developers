import java.util.ArrayList;
import java.util.LinkedList;


public class Album
{
    private String albumArtist;
    private String albumTitle;
    private ArrayList<Song> trackList;

    public Album(String albumArtist, String albumTitle)
    {
        this.albumArtist = albumArtist;
        this.albumTitle = albumTitle;
        this.trackList = new ArrayList<>();
    }

    public String getAlbumArtist()
    {
        return this.albumArtist;
    }

    public String getAlbumTitle()
    {
        return this.albumTitle;
    }

    public void getTrackList(Album album)
    {
        System.out.println(this.albumArtist + " - " + this.albumTitle);
        System.out.println("*****************");
        for (Song song : this.trackList)
        {
            System.out.println(song.toString());
        }
        System.out.println("*****************");
        System.out.println("Total Duration: " + getAlbumDuration(album) + " \r");
    }

    public double getAlbumDuration(Album album)
    {
        double duration = 0.0;
        if (this.trackList.isEmpty())
        {
            System.out.println("No tracks on album " + getAlbumTitle());
        }
        else
        {
            for (Song song : this.trackList)
            {
                duration += song.getDuration();
            }
        }
        return duration;
    }

    private Song findSong(String trackTitle)
    {
        for (Song song : this.trackList)
        {
            if (song.getTitle().equals(trackTitle))
            {
                return song;
            }
        }
        return null;
    }

    public void addTrack(String trackTitle, double duration)
    {
        if (duration > 0.0)
        {
            if (findSong(trackTitle) == null)
            {
                Song newTrack = new Song(trackTitle, duration);
                trackList.add(newTrack);
            }
            else
            {
                System.out.println(trackTitle + " has already been added to the list");
            }
        }
        else
        {
            System.out.println("Track length must be greater than 0.0");
        }
    }

    public void addToPlaylist(int trackNumber, LinkedList<Song> playList)
    {
        int index = trackNumber -1;
        if((index >= 0) && (index <= this.trackList.size())){
            playList.add(this.trackList.get(index));
        }
        else{
            System.out.println("Track number '" + trackNumber + "' does not exist on this album");
        }
    }

    public void addToPlaylist(String trackTitle, LinkedList<Song> playList)
    {
        Song track = findSong(trackTitle);
        if(track != null){
            playList.add(track);
        }
        else{
            System.out.println("Track '" + trackTitle + "' does not exist on this album");
        }
    }

}
