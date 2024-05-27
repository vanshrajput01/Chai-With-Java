// numeric pattern problem 02 :- 
// Pattern is :- 
/* 
1
12
123
1234
12345 */

import java.util.Scanner;

public class  NumericPatternProblem02{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Numeric pattern Problem 02!!");
        System.out.print("Enter how many rows :- ");
        int r = s.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                
            }
            System.out.println();
            
        }
    }
}
