public class Printer
{
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex)
    {
        if ((tonerLevel >= 0) && (tonerLevel <= 100))
        {
            this.tonerLevel = tonerLevel;
        }
        else
        {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount)
    {
        if ((tonerAmount > 0) && (tonerAmount <= 100))
        {
            if(this.tonerLevel + tonerAmount <= 100){
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }

        return -1;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;

        if(this.duplex){
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pages / 2) + (pages % 2);
        }

        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }

}