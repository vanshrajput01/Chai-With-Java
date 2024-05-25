// Find Sum of Digit in given number n

import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args){
        System.out.println("Find the sum of digits in given number n!!");
        System.out.print("Enter a number :- ");
        Scanner s = new Scanner(System.in);
        int enteredValue = s.nextInt();
        int sumOfNumbers = 0;
        int tempVlaue = enteredValue;
        int tempVlaue2 = 0;
        while(tempVlaue > 0){
            tempVlaue2 = tempVlaue % 10;
            sumOfNumbers = sumOfNumbers + tempVlaue2;
            tempVlaue = tempVlaue/10;

        }
        
         System.out.println("your entered number is " + enteredValue + " sum of digits is:- " + sumOfNumbers);


 
    






    }
}