// Find sum of Series 
// s = 1-2+3-4......n
// Here odd number is add and Even number is Substract.

import java.util.Scanner;

public class FindSumOfSeries{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Find sum of series up to n!!");
        System.out.println("Enter a number :- ");
        int enteredValue = s.nextInt();
        int tempValue = enteredValue;
        int sumOfSeries = 0; 
        // Loop
        for(int i = 0; i<=tempValue;i++){
            if (i%2 == 0){
                sumOfSeries= sumOfSeries - i;

            }
            else{
                sumOfSeries = sumOfSeries + i;

            }
        }
        System.out.println(sumOfSeries);

        

    }

}


