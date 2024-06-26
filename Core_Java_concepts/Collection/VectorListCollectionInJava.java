

import java.util.*;
// Vector collection in Java  



public class ArrayCollectionInJava{
    public static void main(String[] args) {

        Vector<String> animalNames = new Vector<>();

        animalNames.add("Cats");
        animalNames.add("Dogs");
        animalNames.add("deer");

        // Traversing Vector using foreach methid in java

        animalNames.forEach(ele->{
            System.out.print(ele);
        });

        

 }
}
