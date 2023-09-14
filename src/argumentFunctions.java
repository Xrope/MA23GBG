
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class argumentFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menuItemPicked;

        do {
            printMenu();
            menuItemPicked = sc.nextLine();
            switch (menuItemPicked) {

                case "1" -> {
                    boolean validInput = false;
                    double num1 = 0;
                    double num2 = 0;
                    while (validInput == false) {
                         try {
                            System.out.print("Första talet:");
                             num1 = sc.nextDouble();
                            System.out.print("Andra talet:");
                             num2 = sc.nextDouble();
                            validInput =  true;
                            sc.nextLine();
                        }catch (InputMismatchException e){
                             System.out.println("Ops det blev något fel. Prova igen");
                            sc.nextLine();
                         }
                    }

                    double sum = add2Numbers(num1, num2);
                    System.out.println("Summan är " + sum);
                }
                case "2" -> {
                    System.out.println("Vilket ord gäller vill du leta i?");
                    String wordToSearchIn = sc.nextLine();

                    System.out.println("Vilken bokstav vill du leta efter?");
                    char charToCount = sc.nextLine().toLowerCase().charAt(0);
                    int timesAppeared = countNumberOfTimesLetterInAString(wordToSearchIn, charToCount);
                    System.out.println("Det finns " + timesAppeared +" " + charToCount + " i ordet " + wordToSearchIn + ".");
                }
                case "3" -> {
                    System.out.println("Skriv in den sträng som du vill spegelvända.");
                    String toReverse = sc.nextLine();
                    String reversed = reverseString(toReverse);
                    System.out.println("Ordet " + toReverse + " blir " + reversed + " spegelvänt.");
                }
                case "4" -> {
                    System.out.println("Skriv ett gäng med siffror att summera.");
                    String numberString = sc.nextLine();
                    int sum = sumOfStringNumbers(numberString);
                    System.out.println("Summan av siffrorna i " + numberString + " är " + sum + ".");
                }
                case "e" -> {
                    System.out.println("Avslutas");
                }
                case "5" ->{

                    System.out.println("Vilken sträng vill du göra till array");

                    String text = sc.nextLine();
                    ArrayList<Character> stringArray =  turnStringIntoArray(text);
                    System.out.println(stringArray);
                }
                default -> {
                    System.out.println("menu default");
                }
            }
            System.out.println();
        }while (!menuItemPicked.equalsIgnoreCase("e"));
    }

    static double add2Numbers(double num1, double num2){
        return  num1 + num2;
    }

    static void printMenu(){
        System.out.println("Vad vill du göra");
        System.out.println("1. Addera två tal.");
        System.out.println("2. Räkna bokstäver i en sträng");
        System.out.println("3. Spegelvänd en sträng.");
        System.out.println("4. Summer alla tal i en sträng.");
        System.out.println("e. Avsluta.");
    }
    static int countNumberOfTimesLetterInAString( String wordToSearchIn, char charToCount){

        int timesAppeared = 0;
        for (int i = 0; i < wordToSearchIn.length(); i++ ){
            if (wordToSearchIn.toLowerCase().charAt(i) == charToCount){
                timesAppeared++;
            }
        }
        return timesAppeared;

    }

    static String reverseString(String toReverse){
        String reversed = "";
        for (int i = toReverse.length()-1; i >= 0; i-- ){
            reversed = reversed + toReverse.charAt(i);
        }
        return reversed;
    }
    static int sumOfStringNumbers(String numberString){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++){
            int charValue = Character.getNumericValue(numberString.charAt(i));
            if (charValue > 0 && charValue <= 9){
                sum += Character.getNumericValue(numberString.charAt(i));
            }
        }
        return sum;
    }
    static ArrayList<Character> turnStringIntoArray(String toBeArray){
        ArrayList<Character> array = new ArrayList<>();
        for (int i = 0; i < toBeArray.length(); i++){
            array.add(toBeArray.charAt(i));
        }
        return array;
    }
}
