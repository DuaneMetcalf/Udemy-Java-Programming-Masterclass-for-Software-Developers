public class Bed
{

    private String size;
    private int pillows;
    private int sheets;
    private int duvets;

    public Bed(String size, int pillows, int sheets, int duvets)
    {
        this.size = size;
        this.pillows = pillows;
        this.sheets = sheets;
        this.duvets = duvets;
    }

    public String getSize()
    {
        return size;
    }

    public int getPillows()
    {
        return pillows;
    }

    public int getSheets()
    {
        return sheets;
    }

    public int getDuvets()
    {
        return duvets;
    }

    public void make()
    {
        System.out.println("Bed.make()");
    }

}