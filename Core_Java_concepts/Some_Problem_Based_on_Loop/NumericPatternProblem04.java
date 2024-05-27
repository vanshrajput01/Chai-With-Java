// numeric pattern problem 04 :- 
// Pattern is :- 
/* 
12121212
21212121
12121212
21212121
 */

import java.util.Scanner;

public class  NumericPatternProblem04{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Numeric pattern Problem 04!!");
        System.out.print("Enter how many rows :- ");
        int r = s.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i%2 == 0){
                    for (int k = 2; k > 0; k--){
                        System.out.print(k);
                        
                    }
                }
                else{
                    for (int k = 1; k <= 2; k++){
                        System.out.print(k);
                    }
                }
                
                
            }
            System.out.println();
            
        }
    }
}
