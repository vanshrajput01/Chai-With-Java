// count number of occurrence 
 
class ArrayClass{
    void countNumberOfoccurrence(int arr[],int n){
        int count = 0;
        for(int ele : arr){
            if (ele ==  n){
                count++;

            }
        }

        System.out.println(n  + " value occurrence of your entered array is :- " + count);


    }
}

public class P1ArraysInJava{
    public static void main(String[] args) {
        ArrayClass objArrayClass = new ArrayClass();
        int numbersArray[] = {1,2,34,5,6,70,3,2,2};
        objArrayClass.countNumberOfoccurrence(numbersArray,2);
    
    }

}
