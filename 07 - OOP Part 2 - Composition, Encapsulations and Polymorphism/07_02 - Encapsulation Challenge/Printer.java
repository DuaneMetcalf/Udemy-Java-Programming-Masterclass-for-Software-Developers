public class Printer
{

    private int tonerLevel;
    private boolean duplex;
    private int pagesPrinted;

    public Printer(int tonerLevel, boolean duplex)
    {
        if (tonerLevel >= 0 && tonerLevel <= 100)
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

    public int getTonerLevel()
    {
        return tonerLevel;
    }

    public boolean isDuplex()
    {
        return duplex;
    }

    public int getPagesPrinted()
    {
        return pagesPrinted;
    }

    public int refillToner(int tonerAmount)
    {
        if (tonerAmount > 0 && tonerAmount <= 100)
        {
            if (this.tonerLevel + tonerAmount > 100)
            {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            System.out.println("Toner refilled");
            return this.tonerLevel;
        }
        else
        {
            return -1;
        }
    }

    public int printPages(int numOfPages)
    {
        int pagesToPrint = numOfPages;
        if (this.duplex)
        {
            pagesToPrint = (numOfPages / 2) + (numOfPages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        this.tonerLevel -= numOfPages;
        return pagesToPrint;
    }

}