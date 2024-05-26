// Example 01 :- rectangluar Pattern 

import java.util.Scanner;

public class PatternProblem01{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("rectangluar Pattern!!");
        System.out.print("Enter How amny rows :- ");
        int r = s.nextInt();
        System.out.print("Enter How many columns :- ");
        int c = s.nextInt();

        
        for (int i = 1 ; i <= r;i++){ // for row
            for (int j = 1 ; j <= c;j++){ // For columns 
                System.out.print("*");
            
        }
        System.out.println("");
        
            
        }

    }

}
