import java.util.Scanner;
// find greater number

public class ConditionalStatementP03{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Check Which is greater number!!");
        System.out.println("Enter a number :");
        int firstNumber = s.nextInt();
        System.out.println("Enter second number :");
        int sceondNumber = s.nextInt(); 
        System.out.println("Enter thrid number :");
        int thridNumber = s.nextInt();

        if (firstNumber > sceondNumber && firstNumber > thridNumber) {
            System.out.println(firstNumber + " is greater");
            
        }
        else if (sceondNumber > thridNumber && sceondNumber > firstNumber) {
            System.out.println(sceondNumber + " is greater");
            
        }
        else if (thridNumber > firstNumber && thridNumber > sceondNumber){
            System.out.println(thridNumber + " is greater");
        }
        else{
            System.out.println("Entered value is same");
        }

    }
}