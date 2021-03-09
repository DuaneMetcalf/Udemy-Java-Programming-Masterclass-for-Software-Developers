public class Song
{
    private String trackTitle;
    private double trackDuration;

    public Song(String title, double duration)
    {
        this.trackTitle = title;
        this.trackDuration = duration;
    }

    @Override
    public String toString()
    {
        return this.trackTitle + ": " + this.trackDuration;
    }
    public String getTitle()
    {
        return this.trackTitle;
    }

    public double getDuration()
    {
        return this.trackDuration;
    }

}
