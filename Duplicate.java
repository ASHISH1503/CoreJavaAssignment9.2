import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate {

	static ArrayList<String> removeDuplicates(ArrayList<String> list) {


        ArrayList<String> result = new ArrayList<String>();


        HashSet<String> set = new HashSet<String>();


        for (String item : list) {


            if (!set.contains(item)) {
                result.add(item);
                set.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("LG");
        list.add("SAMSUNG");
        list.add("SONY");
        list.add("LG");
        list.add("SONY");
        list.add("SAMSUNG");
        list.add("SAMSUNG");
        list.add("PHILIPS");

        ArrayList<String> unique = removeDuplicates(list);
        for (String element : unique) {
            System.out.println(element);
        }
    }
}