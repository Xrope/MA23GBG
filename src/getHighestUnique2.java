import java.util.ArrayList;
import java.util.Random;

public class getHighestUnique2 {
    public static void main(String[] args) {
        int MAX_RANDOM_NUMBER = 100;
        int AMOUNT_OF_NUMBERS = 100;
        ArrayList<Integer> randomList = getRandomList(MAX_RANDOM_NUMBER, AMOUNT_OF_NUMBERS);




    }

    static ArrayList<Integer> getRandomList(int max, int amount){
        ArrayList<Integer> randomList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 1; i <= amount; i++){
            randomList.add(rand.nextInt(max));
        }
        return randomList;
    }
    static ArrayList<Integer> getUniqueList(ArrayList<Integer> randomList){
        ArrayList<Integer> uniqueList = new ArrayList<>();

        //Går igenom listan och sparar 





        return uniqueList;
    }
}
