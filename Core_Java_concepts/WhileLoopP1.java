import java.util.Scanner;

public class WhileLoopP1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Sum of numbers!!");
        int sumOfNumbers = 0;
        while(true){
            System.out.println("Please enter any number :- !! if You see output of your program then pass value is -1 ");
            int numberValue = s.nextInt();
            if (numberValue  < 0){
                System.out.println("Output your program is :- ");
                System.out.println(sumOfNumbers);
                break;

                

            }else{
                sumOfNumbers = sumOfNumbers + numberValue;
            }


        }

    }
}


