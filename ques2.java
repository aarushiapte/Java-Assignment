
import java.util.*;

public class ques2 {

    public static void main(String args[]){
        SortedSet<String> str1 = new TreeSet<String>(comp_findups);

        //if no user input given
        str1.add("A");
        str1.add("a");
        str1.add("b");
        str1.add("H");

       // Comparator<String> com = new Findups();

        System.out.println("On comparing, the unique values are:");
        for(String i : str1){
            System.out.println(i);
        }
    }

    static final Comparator<String> comp_findups
            = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };
    
}
