// Numeric pattern problem 01 :- 
// Pattern is :- 
/* 1234567
2345671
3456712
4567123
5671234
6712345
7123456 */

import java.util.Scanner;

public class NumericPatternProblem01{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Numeric Pattern Problem 01!!");
        System.out.print("Enter how many rows :- ");
        int r = s.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = i + 1; j <= r; j++){
                System.out.print(j);

                
            }
            if (i >= 1){
                for(int k = 1;k <= i;k++){
                    System.out.print(k);
                }
            } 
            System.out.println();
        }
    }

}
