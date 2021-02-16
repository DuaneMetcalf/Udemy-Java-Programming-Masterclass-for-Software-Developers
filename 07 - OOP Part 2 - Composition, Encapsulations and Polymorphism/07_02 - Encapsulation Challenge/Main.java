public class Main
{
    public static void main(String[] args)
    {
        Printer printer = new Printer(10, true);

        System.out.println("Initial pages printed = " + printer.getPagesPrinted());

        int pages = printer.printPages(4);

        System.out.println("Pages printed was " + pages + " printer has printed " + printer.getPagesPrinted() + " pages");
        System.out.println("Current toner level = " + printer.getTonerLevel() + "%");

        pages = printer.printPages(2);

        System.out.println("Pages printed was " + pages + " printer has printed " + printer.getPagesPrinted() + " pages");
        System.out.println("Current toner level = " + printer.getTonerLevel() + "%");
    }

}