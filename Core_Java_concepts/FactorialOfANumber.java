import java.util.Scanner;

public class FactorialOfANumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Factorial of a Number Progarm in java : - ");
        int numberValue = s.nextInt();
        int resultValue = 1;
        for(int i = 1;i <= numberValue; i++){
            resultValue = resultValue  * i;



        }
        System.out.println("Factorial of " + numberValue + " is " + resultValue);

    }
}