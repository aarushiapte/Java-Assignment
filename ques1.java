import java.util.*;

class question1 {

    public static void main(String[] args){
        List<String> list1 = new ArrayList<String>();

        //if user input not given in cmd line
        list1.add("Hello");
        list1.add("Bye");
        list1.add("Morning");
        list1.add("Night");
        list1.add("Afternoon");
        list1.add("Evening");

        Collections.shuffle(list1);

        //printing using for
        for (String i : list1){
            System.out.println(i);
        }

        //using streams
        list1.stream().forEach(i->System.out.println(i));

    }
}