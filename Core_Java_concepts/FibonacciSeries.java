import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args){
        System.out.println("Fibonacci Series Progarm in Java!!");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number :- ");
        int numberValue = s.nextInt();
        int f1 = 0;
        int f2 = 1;
        int resultValue = 0;
        
        // LOOP
        for(int i = 1;i <= numberValue; i = i + resultValue){
            resultValue = f1 + f2;
            System.out.println(resultValue);

            f1 = f2;
            f2 = resultValue;
        
            


        }
    }
}