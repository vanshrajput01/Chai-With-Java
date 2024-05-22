import java.util.Scanner;

public class Example2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Example 02 user input");
        System.out.println("Enter your name");
        String name = s.next();// that is not print complete name this function only print first letter of your enter input
        System.out.println("Entered name is : " + name);


    }
}