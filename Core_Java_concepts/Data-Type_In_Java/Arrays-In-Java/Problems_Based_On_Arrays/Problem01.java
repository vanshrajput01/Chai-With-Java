// example of find last occurrence of number in given array
 
class ArrayClass{
    void countNumberOfOccurance(int arr[],int n){
        int lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(n == arr[i]){
                lastIndex = i;
            }
            
        }


        System.out.println("last Occurance of " + n +  " your entered array is :- " + lastIndex);


    }
}

public class P1ArraysInJava{
    public static void main(String[] args) {
        ArrayClass objArrayClass = new ArrayClass();
        int numbersArray[] = {1,2,34,5,6,70,3,2,2};
        objArrayClass.countNumberOfOccurance(numbersArray,2);
    
    }

}
