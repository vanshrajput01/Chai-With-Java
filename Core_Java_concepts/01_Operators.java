import java.awt.SystemTray;
import java.util.Scanner;

public class FirstsProgram{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Arithmetic Operators in Java");
        System.out.println("Enter a number : ");
        int num1 = s.nextInt();
        System.out.println("Enter second number : ");
        int num2 = s.nextInt();
        // Output of all Arithmatic operators in java
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

    }
}