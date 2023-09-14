import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menuItemPicked;

        do {
            printMenu();
            menuItemPicked = sc.nextLine();
            switch (menuItemPicked) {

                case "1" -> {
                    add2Numbers();
                }
                case "2" -> {
                    countNumberOfTimesLetterInAString();
                }
                case "3" -> {
                    reverseString();
                }
                case "4" -> {
                    sumOfStringNumbers();
                }
                case "e" -> {
                    System.out.println("Avslutas");
                }
                default -> {
                    System.out.println("Ogiltigt val.");
                }
            }
            System.out.println();
        }while (!menuItemPicked.equalsIgnoreCase("e"));
    }

    static void add2Numbers(){
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;

        do {
            try {
                System.out.print("Första talet:");
                double num1 = sc.nextDouble();
                System.out.print("Andra talet:");
                double num2 = sc.nextDouble();
                double sum = num1 + num2;
                System.out.println("Summan är " + sum);
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Ops något blev fel. Vi börjar om.");
                sc.nextLine();
            }
        }while(!validInput);
    }

    static void printMenu(){
        System.out.println("Vad vill du göra");
        System.out.println("1. Addera två tal.");
        System.out.println("2. Räkna bokstäver i en sträng");
        System.out.println("3. Spegelvänd en sträng.");
        System.out.println("4. Summer alla tal i en sträng.");
        System.out.println("e. Avsluta.");
    }
    static void countNumberOfTimesLetterInAString(){
        Scanner sc = new Scanner(System.in);
        int timesAppeared = 0;

        System.out.println("Vilket ord gäller vill du leta i?");
        String wordToSearchIn = sc.nextLine();

        System.out.println("Vilken bokstav vill du leta efter?");
        char charToCount = sc.nextLine().charAt(0);

        for (int i = 0; i < wordToSearchIn.length(); i++ ){
            if (wordToSearchIn.toLowerCase().charAt(i) == charToCount){
                timesAppeared++;
            }

        }
        System.out.println("Det finns " + timesAppeared +" " + charToCount + " i ordet " + wordToSearchIn + ".");
    }

    static void reverseString(){
        Scanner sc = new Scanner(System.in);
        String reversed = "";
        System.out.println("Skriv in den sträng som du vill spegelvända.");
        String toReverse = sc.nextLine();

        for (int i = toReverse.length()-1; i >= 0; i-- ){
            reversed = reversed + toReverse.charAt(i);
        }
        System.out.println("Ordet " + toReverse + " blir " + reversed + " spegelvänt.");
    }

    static void sumOfStringNumbers(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Skriv ett gäng med siffror att summera.");
        String numberString = sc.nextLine();

        for (int i = 0; i < numberString.length(); i++){
            int charValue = Character.getNumericValue(numberString.charAt(i));
            if (charValue > 0 && charValue <= 9){
                sum += Character.getNumericValue(numberString.charAt(i));
            }
        }
        System.out.println("Summan av siffrorna i " + numberString + " är " + sum + ".");
    }
}
