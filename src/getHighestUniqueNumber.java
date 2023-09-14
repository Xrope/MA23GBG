import java.util.ArrayList;
import java.util.Random;

public class getHighestUniqueNumber {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        int highestUniqueNumber = 0;
        int MAX_RANDOM_NUMBER = 100;
        int AMOUNT_OF_NUMBERS = 100;
        randomList = getRandomList(MAX_RANDOM_NUMBER, AMOUNT_OF_NUMBERS);

        System.out.println(randomList);

        for (int num: randomList) {
            if (num > highestUniqueNumber){
                boolean isUnique = checkUniqueNumber(num, randomList);
                if (isUnique){
                    highestUniqueNumber = num;
                }
            }
        }
        System.out.println("Det högst unika numret är " + highestUniqueNumber);
    }

    static boolean checkUniqueNumber(int highestNumber, ArrayList<Integer> randomList){
        int timesInList = 0;
        for (int num: randomList) {
            if(num == highestNumber){
                timesInList++;
            }
        }
        if (timesInList == 1){
            return true;
        }
        return false;
    }

    static ArrayList<Integer> getRandomList(int max, int amount){
        ArrayList<Integer> randomList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 1; i <= amount; i++){
            randomList.add(rand.nextInt(max));
        }
        return randomList;
    }
}
