// For loop in java
import java.util.Scanner;
// find out divisible by 3 and 5

public class ForLoopInJavaE3{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any value");
        int enteredValue = s.nextInt();
        
        for (int i=1; i<=enteredValue;i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " is divisible by 3 and 5");

            }
            else if(i%3 ==0){
                System.out.println(i + " is divisible by 3");

            } 
            else if(i % 5 == 0){
                System.out.println(i+ " is divisible by 5");
            }
            else{
                System.out.println(i);
            }

        }
    }
}