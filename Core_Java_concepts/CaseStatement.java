// Case statement in java 

import java.util.Scanner;

public class CaseStatement{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Case Statement in Java!!");
        System.out.print("Enter Your Grade :- ");
        char enteredGrade = s.next().charAt(0); // char a input;
        // Case Statement

         switch (enteredGrade){
            case 'A':
                System.out.println("Greate!!");
                break;
            case 'B':
                System.out.println("Good!!");
                break;
            case 'C':
                System.out.println("Not bad!!");
                break;
            default:
                System.out.println("Please enter your correct grade");
         }


        

        
    }
}
