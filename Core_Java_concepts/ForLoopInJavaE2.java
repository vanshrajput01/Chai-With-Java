// For loop in Java
// 1 to n get even or odd number
import java.util.Scanner;

public class ForLoopInJavaE2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any one number!!");
        int numberValue = s.nextInt();
        for(int i=1;i<=numberValue;i++){
            if (i%2 == 0){
                System.out.println(i + " Even number");
            }else{
                System.out.println(i+ " odd number");
            }


        }

    }
}