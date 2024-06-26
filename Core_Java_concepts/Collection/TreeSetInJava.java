import java.util.*;

public class SetCollectionInJava{
    public static void main(String[] args) {

        // In TreeSet collection duplicate are not allowed 
        HashSet<Integer> numberValues = new HashSet<>();

        numberValues.add(112);
        numberValues.add(101);
        numberValues.add(102);
        numberValues.add(103);
        numberValues.add(104);
        numberValues.add(101);
        numberValues.add(102);
        numberValues.add(103);
        numberValues.add(106);

        TreeSet<Integer> numberValues01 = new TreeSet<>();

        numberValues01.addAll(numberValues);

        System.out.println(numberValues01);

        // Traversing Tree set 

        Iterator objIterator = numberValues01.iterator();

        while(objIterator.hasNext()){
            System.out.println(objIterator.next());

        }


        





        




        
    }
}
