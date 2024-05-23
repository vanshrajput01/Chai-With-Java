// For loop in Java
import java.util.Scanner;

public class ForLoopInJava{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to get table of this number");
        int tableNumber = s.nextInt();
        System.out.println(tableNumber + " table is : - ");
        for(int i=1;i<=10;i++){
            System.out.println(i * tableNumber);
        }

    }
}