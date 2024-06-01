// How to return array in java
 
class ArrayClass{

    int[] findminAndMaxElement(int arr[]){
        int minElement = arr[0];
        int maxElement = arr[0];
        int minAndMaxArray[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if(minElement > arr[i]){
                minElement = arr[i]; 

                
                

            }else{
                if(maxElement < arr[i]){
                    maxElement = arr[i];
                }
                    


            }
            
        }
        minAndMaxArray[0] = minElement;
        minAndMaxArray[1] = maxElement;
        return minAndMaxArray;









    }
}

public class P1ArraysInJava{
    public static void main(String[] args) {
        ArrayClass objArrayClass = new ArrayClass();
        int numbersArray[] = {72,20,33,19,51,80};
        int returnedArr [] = new int[2];
        // pass array as a argument;
        returnedArr = objArrayClass.findminAndMaxElement(numbersArray);
        // print value of return array
        for(int ele : returnedArr){
            System.out.println("Return array elements is :- " + ele);
        }


        
    
    }

}
