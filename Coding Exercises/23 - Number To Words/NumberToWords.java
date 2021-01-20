public class NumberToWords {
        public static void numberToWords(int number){

            int lastDigit = 0;
            int numberReversed = reverse(number);
            String numberWords = "";
            int missingZeros = (getDigitCount(number) - getDigitCount(numberReversed));

            if (number < 0){
                System.out.println("Invalid Value");
            }

            do {
                lastDigit = (numberReversed % 10);
                if (lastDigit == 0) {
                    numberWords += "Zero ";
                    numberReversed /= 10;
                }
                if (lastDigit == 1) {
                    numberWords += "One ";
                    numberReversed /= 10;
                }
                if (lastDigit == 2) {
                    numberWords += "Two ";
                    numberReversed /= 10;
                }
                if (lastDigit == 3) {
                    numberWords += "Three ";
                    numberReversed /= 10;
                }
                if (lastDigit == 4) {
                    numberWords += "Four ";
                    numberReversed /= 10;
                }
                if (lastDigit == 5) {
                    numberWords += "Five ";
                    numberReversed /= 10;
                }
                if (lastDigit == 6) {
                    numberWords += "Six ";
                    numberReversed /= 10;
                }
                if (lastDigit == 7) {
                    numberWords += "Seven ";
                    numberReversed /= 10;
                }
                if (lastDigit == 8) {
                    numberWords += "Eight ";
                    numberReversed /= 10;
                }
                if (lastDigit == 9) {
                    numberWords += "Nine ";
                    numberReversed /= 10;
                }
            }
            while(numberReversed > 0);

            for (int i = 1; i <= missingZeros; i++){
                numberWords += "Zero ";
            }
            System.out.println(numberWords);
        }

        public static int getDigitCount(int number){

            int counter = 0;

            if (number < 0){
                return -1;
            }

            do {
                counter++;
                number /= 10;
            } while (number != 0);

            return counter;
        }

        public static int reverse(int number){

            int reversed = 0;

            while (number != 0){
                reversed += (number % 10);
                reversed *= 10;
                number /= 10;
            }

            reversed /= 10;
            return reversed;
        }
    }
