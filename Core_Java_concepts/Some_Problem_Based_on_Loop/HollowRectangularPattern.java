// Example 02 :- Hollow rectangular Pattern 

import java.util.Scanner;

public class PatternProblem02{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("rectangluar Pattern!!");
        System.out.print("Enter How amny rows :- ");
        int r = s.nextInt();
        int tempValue = r;
        System.out.print("Enter How many columns :- ");
        int c = s.nextInt();
        int tempValue2 = c;

        for(int i =1; i <= r;i++){
            for(int j = 1; j <= c;j++){
                if (i == 1 || i == tempValue){
                    System.out.print("*");
                }else{
                    if(j == 1 || j == tempValue2){
                        System.out.print("*");
                    }
                    else{
                       System.out.print(" "); 
                    }


                }

            }
            System.out.println();
        }

        


    }

}

