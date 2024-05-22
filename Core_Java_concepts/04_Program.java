import java.util.Scanner;

public class ProgramExample04{
    public static void main(String[] args){
        System.out.println("Example 04 based on user input");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        float num1 = s.nextFloat();
        System.out.println("Enter second decimal number");
        int num2 = s.nextInt(); // that give the error :- InputMismatchException because i am enter float value
        // but read integer value 
        System.out.println("Your enter numbers is " + num1 + "||" + num2); // Error
 

    }
}