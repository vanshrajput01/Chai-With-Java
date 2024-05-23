import java.util.Scanner;

public class ConditionalStatementP02{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter you age :-");
        int yourAge = s.nextInt();
        if (yourAge < 18){
            System.out.println("You are child");
        } 
        else if(yourAge >= 18 && yourAge <= 60){
            System.out.println("You are Young man");

        }
        else{
            System.out.println("You are old man");
        }



    }
}