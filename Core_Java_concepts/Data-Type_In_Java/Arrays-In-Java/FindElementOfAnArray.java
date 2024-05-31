// find element of an array. if present then return the index else return -1 

import java.util.Scanner;

public class P1ArraysInJava{
    static int numbersArray[] = {21,2,3,4,5,6,11,7,0};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("{");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i]);
            if (numbersArray.length-1 > i){
                System.out.print(" , ");
            } 
        }


        System.out.println("}");
        System.out.print("Enter element you want to find in this array : - ");
        int enteredElement = s.nextInt();
        int resultValue = -1;

        for (int i = 0; i < numbersArray.length; i++) {

                if (enteredElement == numbersArray[i]){
                    System.out.println("Element is present in array and array index is ");
                    resultValue = i;
                    break;
                    
                    
                }
        }
        System.out.println(resultValue);
        
    }







        
}
