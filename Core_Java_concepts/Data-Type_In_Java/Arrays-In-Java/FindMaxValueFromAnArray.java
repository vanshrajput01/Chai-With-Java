// find max of element of an array in java 

public class P1ArraysInJava{
    static int numbersArray[] = {21,2,3,4,5,6,11,7,8};
    static int maxVariable = 0;

    public static void main(String[] args) {
        maxVariable = numbersArray[0];
        // For each loop in java
        for (int i = 0; i < numbersArray.length; i++) {

                if (maxVariable < numbersArray[i]){
                    maxVariable = numbersArray[i];
                }
        }
        System.out.println(maxVariable);
        
    }







        
}
