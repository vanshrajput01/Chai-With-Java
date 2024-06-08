// 1. examples of Throw in java
import java.util.Scanner;
public class E01ExcetionHandling{
    // user define exception in java

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : - ");
        int age = sc.nextInt();
        try {
            if(age > 100){
                throw new ArithmeticException("Invalid age");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }






    }
}

