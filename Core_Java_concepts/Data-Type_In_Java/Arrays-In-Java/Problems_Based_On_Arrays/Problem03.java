// count the number of elements strictly greater than given number.
 
class ArrayClass{
    void problem(int arr[],int n){
        int count = 0;
        for(int ele : arr){
            if (n < ele){
                count++;
            }

        }



        System.out.println("elements strictly greater than" + n + " is :- " + count);


    }
}

public class P1ArraysInJava{
    public static void main(String[] args) {
        ArrayClass objArrayClass = new ArrayClass();
        int numbersArray[] = {1,2,34,5,6,70,3,2,2};
        objArrayClass.problem(numbersArray,34);
    
    }

}
