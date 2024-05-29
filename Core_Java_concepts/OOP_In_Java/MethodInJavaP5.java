// print greeting message using method!!

import java.util.Scanner;

public class Main{
    // declare greeting method
    static void greeting(String your_Name){
        System.out.println(your_Name + " Welcome to Git code space");

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // get input from user

        System.out.print("Enter you name :- ");
        String name =  s.nextLine();
        // call greeting method
        greeting(name);

    }
}