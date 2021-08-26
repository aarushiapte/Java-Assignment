import java.util.*;

public class ques3 {

    static void trimList(List<String> strings) {
        for (ListIterator<String> l1 = strings.listIterator(); l1.hasNext(); ) {
            l1.set(l1.next().trim());
        }
    }
    
    public static void main(String args[]){
        List<String> list1 = new ArrayList<String>();

        trimList(list1);
        for (String i : list1) {
            System.out.println(i);
        }
    }
}
