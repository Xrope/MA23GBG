import java.util.ArrayList;

public class listorLektionGBG {
    public static void main(String[] args) {
        ArrayList<String> allNames = new ArrayList<>();

        System.out.println(allNames.size());

        allNames.add("David");
        allNames.add("Susan");
        allNames.add("Laura");

        System.out.println(allNames.size());

        System.out.println(allNames.get(2));
        System.out.println(allNames.contains("David"));

        for (String name: allNames){
            System.out.println(name);
        }



    }
}
