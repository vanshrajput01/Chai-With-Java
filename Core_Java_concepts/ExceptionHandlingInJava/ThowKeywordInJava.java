// 1. examples of Throw in java
import java.util.Scanner;
// user defined exception in java
class myException extends Exception{

        public myException(String message) {
            super(message);
        }
        
    }




public class E01ExcetionHandling{
    // user define exception in java

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age : - ");
        int age = sc.nextInt();
        try {
            if(age > 100){
                throw new myException("Invalid age!!");
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }






    }
}

