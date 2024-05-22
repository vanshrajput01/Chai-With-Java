import java.util.Scanner;

public class UserInput03{
    public static void main(String[] args){
        System.out.println("Program 03 Based on user input!!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Firstname : ");
        String fname = s.next();
        System.out.println("Enter your last name :");
        String lname = s.next();
        System.out.println("Program Output");
        System.out.println("Your full name is " + fname + " " + lname);

    }
}