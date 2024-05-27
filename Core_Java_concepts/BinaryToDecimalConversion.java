// Binary to decimal number conversion in java

import java.util.Scanner;

public class BinaryToDecimalConversion{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Binary to decimal number conversion in java!!!");
        System.out.print("Enter any binary number :- ");
        int enteredNumber = s.nextInt();
        int tempValue = enteredNumber;
        int sum = 0;
        int powerValue = 0;
        int tempValue2;
        int powerResult = 1;




        while(tempValue > 0){

            tempValue2 = tempValue % 10;


            for (int i = 1; i <= powerValue; i++) {
                powerResult = powerResult * 2;

            
            }

            sum = sum + (tempValue2 * powerResult);
            powerResult = 1;

        
            


            tempValue = tempValue / 10;
            powerValue++;

        }
        System.out.println(sum);



    }
}
