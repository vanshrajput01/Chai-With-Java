// Inverted Triangular pattern in java


 

import java.util.Scanner;

public class InvertedTriangularPattern{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("rectangluar Pattern!!");
        System.out.print("Enter How amny rows :- ");
        int r = s.nextInt();
        int tempValue = r;

        for (int i = tempValue; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }





        


    }

}

