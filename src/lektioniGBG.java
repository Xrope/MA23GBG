import java.lang.reflect.Array;

public class lektioniGBG {
    public static void main(String[] args) {
        // Array!
        int[] numbers = {3, 5, 6, 9};
        String[] allNames = { "David", "Susan", "Lois", "Laura"};
        String[] moreNames = new String[25];


        for( int i = 0; i < allNames.length; i++){
            System.out.println(allNames[i]);
        }

        for (String name: allNames) {
            System.out.println(name);
        }
        boolean found = contains("Lois", allNames);
        
        System.out.println(contains("David", allNames));
        System.out.println(contains("Olle", allNames));



    }

    static boolean contains(String nameToSearchFor, String[] names) {
        for (String name: names) {
            if (name.equalsIgnoreCase(nameToSearchFor)){
                return true;
            }
        }
        return false;
    }



}
