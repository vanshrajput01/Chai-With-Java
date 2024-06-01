// check give array is sorted or not!!
 
class ArrayClass{

    void CheckSortedArray(int arr[]){
        int tempValue = arr[0];
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if(tempValue < arr[i]){
                tempValue = arr[i];
                flag = false;

            }else{
                flag= true;
                break;

            }
            
        }

        if(flag ==true){
            System.out.println("Array is not sorted!!");
        }else{
            System.out.println("Array is sorted!!");

        }





    }
}

public class P1ArraysInJava{
    public static void main(String[] args) {
        ArrayClass objArrayClass = new ArrayClass();
        int numbersArray[] = {10,20,33,42,51};
        objArrayClass.CheckSortedArray(numbersArray);
    
    }

}
