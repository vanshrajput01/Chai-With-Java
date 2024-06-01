// example of deep Copy using clone function
 
class ArrayDetails{
    static void printArray(int arr[]){
        for(int ele : arr){
            System.out.println(ele);
        }
    }
}

public class P1ArraysInJava{
    public static void main(String[] args) {
        ArrayDetails objArrayDetails = new ArrayDetails();
        int arr[] = {1,2,3,4,5};
        // copy Array into another array
        int arr2[] = arr.clone(); 
        System.out.println("Print organial array before change value of arr2 !!");
        objArrayDetails.printArray(arr);
        System.out.println("Print copped Array after change value of arr2");
        objArrayDetails.printArray(arr2);
        arr2[0] = 10;
        arr2[4] = 50;
        System.out.println("Print organial Array after change value of arr2");
        objArrayDetails.printArray(arr); // here also change value value of organial array 
        System.out.println("Print copped Array after change value of arr2");
        objArrayDetails.printArray(arr2);


        

        




        





        
    }

}
