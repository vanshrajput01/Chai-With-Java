// numeric pattern problem 03 :- 
// Pattern is :- 
/* 
1
22
333
4444
55555 */

import java.util.Scanner;

public class  NumericPatternProblem03{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Numeric pattern Problem 03!!");
        System.out.print("Enter how many rows :- ");
        int r = s.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                
            }
            System.out.println();
            
        }
    }
}
