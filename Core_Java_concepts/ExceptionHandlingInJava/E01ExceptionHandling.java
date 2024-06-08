// Exception handling in java
// 1. examples of runtime exception handling in java

public class E01ExcetionHandling{
    public static void main(String[] args) {
        int[] tempArray = new int[5];
        System.out.println("Strat!!");
        try {
            System.out.println("Array element is " + tempArray[6]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End!!");
    }

}

