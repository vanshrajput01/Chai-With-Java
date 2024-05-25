// print the first n factorial numbers 
import  java.util.Scanner;

public class FindFirstNFactorialOfNumber{
    public static void main(String[] args){
        System.out.println("print the first n factorial numbers!!");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :- ");
        int enteredValue = s.nextInt();
        int resultValue = 1;
        int tempValue = 1;

        while(tempValue <= enteredValue){
            for(int i=1;i <= tempValue;i++){
                resultValue = resultValue * i;

            }
            System.out.println(tempValue + " Factorial is : " + resultValue);
            resultValue = 1;
            tempValue++;
            

        }


    }

}

