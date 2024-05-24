
import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Prime number up to n :- ");
        int enteredValue = s.nextInt();
        boolean primeFlag = true;
        int numberValue = 2;

        while(numberValue <= enteredValue){
            for(int i = 2;i < numberValue ; i++){
                if(numberValue % i == 0){
                    primeFlag = false;
                    break;
                }
            }
             if (primeFlag == false){
                System.out.println(numberValue + " not prime");
                primeFlag = true; 
            
            }else{
                System.out.println(numberValue + " prime");

        }
            numberValue++;

        }








               

                
                    
                        
            
        
            
        }
        


    }

