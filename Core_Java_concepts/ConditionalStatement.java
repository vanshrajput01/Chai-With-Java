import java.util.Scanner;

// Check number is Even or odd

public class ConditionalStatement{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to Check number is Even or odd!!");
        int numberValue = s.nextInt();
        if(numberValue % 2 == 0){
            System.out.println("Your Enter number is Even");

        }
        else{
            System.out.println("Your Enter number is odd");
        }

    }

}