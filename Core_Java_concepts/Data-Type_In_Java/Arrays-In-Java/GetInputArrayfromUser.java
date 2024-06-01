import java.util.Scanner;
class ArrayDetails{
    static void printArray(int arr[]){
        for(int ele : arr){
            System.out.println(ele);
        }
    }
}

public class P1ArraysInJava{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of Array : -");
        int arraySize = s.nextInt();
        int enteredArray [] = new int[arraySize];
        ArrayDetails objArrayDetails = new ArrayDetails(); 


        // taking element of an array

        for(int i = 0; i < arraySize;i++){
            System.out.println("enter element of " + i + ":- ");
            enteredArray[i] = s.nextInt(); 
            

        }

        // Print Enter Array
        System.out.println("Print Elemenrt of array!!");
        objArrayDetails.printArray(enteredArray);



        
    }

}
