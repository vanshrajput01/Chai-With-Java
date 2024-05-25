// count number of digit of a give number

import java.util.Scanner;

public class CountDigitOfNumber{
    public static void main(String[] args){
        System.out.println("Count Digit of Number!!!");
        System.out.print("Enter any Digit :- ");
        Scanner s = new Scanner(System.in);
        int countValue = 0; 
        int enteredDigit = s.nextInt();
        int tempVlaue = enteredDigit;

        while(tempVlaue > 0){
                tempVlaue = tempVlaue / 10;
                countValue++;
            
            }
        System.out.println("your entered is " + enteredDigit + " In this number digit is " + countValue);
    }



        
    }
