import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        System.out.println("Original array values are:");
        printArray(myIntegers);
        sortIntegers(myIntegers);
        System.out.println("Sorted array values are:");
        printArray(myIntegers);
    }

    public static int[] getIntegers(int number){
        int[] values = new int[number];
        System.out.println("Enter " + number + " integer values.\r");
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " holds the value " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = array;
        int currentValue = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int x = i + 1; x < sortedArray.length; x++) {
                if(sortedArray[i] < sortedArray[x]) {      
					//swap elements if not in order
                    currentValue = sortedArray[i];
                    sortedArray[i] = sortedArray[x];
                    sortedArray[x] = currentValue;
                }
            }
        }
        return sortedArray;
    }
}