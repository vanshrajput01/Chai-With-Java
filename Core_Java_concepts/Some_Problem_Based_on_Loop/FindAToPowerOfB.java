// Given 2 number a and b.find a raise to the power b

import java.util.Scanner;

public class FindAToPowerOfB{
    public static void main(String[] args){
        System.out.println("Find a raise to power of b!!");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of a :- ");
        int valueOfA = s.nextInt();
        System.out.print("Enter value of B :- ");
        int valueOfB= s.nextInt();
        int tempValue = valueOfA;

        for(int i = 1;i< valueOfB;i++){
            tempValue =  tempValue * valueOfA;

        } 
        System.out.println(valueOfA + " to the power of " + valueOfB +  " is " + tempValue);

    }
}
