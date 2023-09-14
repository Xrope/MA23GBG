import java.util.ArrayList;
import java.util.Scanner;

public class matLista {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> foodList = new ArrayList<>();

        int MAX_SIZE = 3;

        String itemToAdd = "";
        System.out.println("Skapa en matlista.");
        while (!itemToAdd.equals("done")) {
            System.out.println("Skriv en vara. Skriv done för att avsluta");
            itemToAdd = sc.nextLine();

            if (foodList.size() == MAX_SIZE && !itemToAdd.equalsIgnoreCase("done")){
                checkAndReplace(foodList, itemToAdd );


//                foodList.remove(itemToRemove);
//                foodList.add(itemToAdd);

            }else if (!itemToAdd.equalsIgnoreCase("done")){

                foodList.add(itemToAdd);
            }
        }
        printList(foodList);
    }

    public static void checkAndReplace(ArrayList<String> foodList, String itemToAdd ){
        boolean replace = false;
        while (!replace) {
            System.out.println("Skriv namnet på varan du vill ersätta?");
            printList(foodList);
            String itemToRemove = sc.nextLine();
            replace = replaceItem(foodList, itemToRemove, itemToAdd);
        }
    }
    static void printList(ArrayList<String> list){
        int number = 1;
        for (String item: list) {
            System.out.println( number + ". " + item);
            number++;
        }
    }
    static boolean replaceItem(ArrayList<String> list, String itemToReplace, String newItem){

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(itemToReplace)){
                list.set(i, newItem);
                return true;
            }

        }
        return false;
    }
}
