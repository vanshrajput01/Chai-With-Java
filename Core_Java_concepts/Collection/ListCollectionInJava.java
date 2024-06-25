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


        // way 02 :- Using iterator object
        // this method traverse Artray List elements in forword direction

        Iterator<String> objIterator =  list01.iterator();

        while(objIterator.hasNext()){
            System.out.println(objIterator.next());

        }


        
        // Way 03 :- using Listiterator

        ListIterator objListIterator = list01.listIterator(list01.size());
        while(objListIterator.hasPrevious()){
            System.out.println(objListIterator.previous());

        } 

        


    }
}
