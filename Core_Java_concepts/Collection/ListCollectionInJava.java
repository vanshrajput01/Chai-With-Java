// List collection in Java 
// ArrayList in Java
import java.util.ArrayList;


public class ArrayCollectionInJava{
    public static void main(String[] args) {
        // declare ArrayList
        ArrayList<String> list01 = new ArrayList<>();
        list01.add("name01");
        list01.add("name02");
        list01.add("name03");
        list01.add("name04");
        list01.add("name05");
        list01.add("name06");

        //How to traverse Array List in Java
        // way 01 :- Using for each Loop
        for(String ele : list01){
            System.out.println(ele);
        }

        


    }
}
