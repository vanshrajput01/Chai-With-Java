// Print First multiple of 5 or 7


public class PrintFirstMultiple5Or7{
    public static void main(String[] args){
        System.out.println("Print First 5 or 7!!!");
        int numberValue = 1;

        while(numberValue > 0){
             if (numberValue % 5 == 0 && numberValue % 7 == 0){
                System.out.println(numberValue);
                break;
             } 

             numberValue++;
        }


    } 
}
