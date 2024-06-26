

import java.util.*;
// Vector collection in Java  



public class ArrayCollectionInJava{
    public static void main(String[] args) {

        Vector<String> animalNames = new Vector<>();

        animalNames.add("Cats");
        animalNames.add("Dogs");
        animalNames.add("deer");

        // Traversing Vector using foreach method in java

        animalNames.forEach(ele->{
            System.out.print(ele);
        });

        // Traversing Vector using iterable method in java

        for(String aniamlName : animalNames){
            System.out.println(aniamlName);
        }

        // Traversing Vector using iterator method in java

        Iterator  objIterator = animalNames.iterator();
        while(objIterator.hasNext()){
            System.out.println(objIterator.next());

        }

        // Traversing vector backward direction using ListIterator method in java

        ListIterator objListIterator = animalNames.listIterator(animalNames.size());

        while(objListIterator.hasPrevious()){
            System.out.print(objListIterator.previous());

        }

        

 }
}
