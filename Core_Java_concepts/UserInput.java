import java.util.Scanner;
// Program 01 :- 

public class UserInput{
    public static void main(String[] args) {
        System.out.println("How to take user input in java!!");
        // Createing Object of Scanner Class
        Scanner s = new Scanner(System.in);
        System.out.println("Enter one number");
        int num1 = s.nextInt();
        System.out.println("Enter Sceond number");
        int num2 = s.nextInt();
        System.out.println("Your Entered value is  " + num1);
        System.out.println("Your Entered Second number is " + num2);
        int results = num1 + num2;
        System.out.println("Result of "+ num1 + " and "+ num2 + "  is " + results);


    }
}



