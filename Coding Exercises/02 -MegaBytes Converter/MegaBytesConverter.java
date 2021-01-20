public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0) 
		{
            System.out.println("Invalid Value");
        } 
		else 
		{
            int totalMegaBytes = kiloBytes / 1024;
            int remainingKiloBytes = totalMegaBytes % kiloBytes;
            System.out.println(kiloBytes + " KB = " + totalMegaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }
}