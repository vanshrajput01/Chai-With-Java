// numeric pattern problem 06 :- 
// Pattern is :- 
/*
   1
  2 2
 3   3
4444444 

 */

import java.util.Scanner;

public class  NumericPatternProblem06{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Numeric pattern Problem 06!!");
        System.out.print("Enter how many rows :- ");
        int r = s.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1; k++) {
                if(i == 1 || i == r){
                    System.out.print(i);
                }
                else{
                    if(k > 1 && k < i*2-1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(i);
                        
                    }
                }

                
                
            }
            System.out.println();
            
        }
    }
}
