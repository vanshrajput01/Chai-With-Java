// Reverse of agiven number 

import java.util.Scanner;

public class ReverseOfNumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Reverse of number!!");
        System.out.print("Enter any number :- ");
        int enteredValue = s.nextInt();
        int addValue = 0;
        int tempValue1 = 0 ;
        int tempValue = enteredValue;

        while(tempValue > 0){
            tempValue1 = tempValue % 10;
            addValue = (addValue * 10) + tempValue1;
            tempValue = tempValue / 10;




        }
        System.out.println(addValue);



        
    }
}