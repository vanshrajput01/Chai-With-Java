// Triangular Pattern in java
 

import java.util.Scanner;

public class TriangularPattern{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("rectangluar Pattern!!");
        System.out.print("Enter How amny rows :- ");
        int r = s.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

                
            }
            System.out.println();
            
        }



        


    }

}

