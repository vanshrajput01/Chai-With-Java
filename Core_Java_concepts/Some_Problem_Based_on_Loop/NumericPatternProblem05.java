// numeric pattern problem 05 :- 
// Pattern is :- 
/*
   1
  222
 33333
4444444 

 */

import java.util.Scanner;

public class  NumericPatternProblem05{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Numeric pattern Problem 02!!");
        System.out.print("Enter how many rows :- ");
        int r = s.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1; k++) {
                System.out.print(i);

                
                
            }
            System.out.println();
            
        }
    }
}
