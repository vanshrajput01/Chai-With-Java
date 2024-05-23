
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

        // Unary operator in java
        System.out.println("Unary oparator in java");
        System.out.println(num1++);// like value is 10 that give output 10 but after printing that increasing value of num1
        System.out.println(num1--); // like value is 11 that that give me output 11 but after printing that decreasing value of num1

        System.out.println(++num2); //like value of num2 is 2 that give me value 3 beacause this increase/decrese the value firstly and print it. 
        System.out.println(--num2);

    



    }


}