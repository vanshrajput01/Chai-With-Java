// 2-D Array in java
// Example 01 : -

class DemoArray{
    // Declare Arrays in java
    // one way to declare array in java
    // data type[][] nameOfArray = new datatype[size];

    int[][] numbersArray = new int[2][2];

    



    void  Print2DArray(){
        numbersArray[0][0] = 10;
        numbersArray[0][1] = 30;
        numbersArray[1][0] = 20;
        System.out.println("Example of Array literal " + numbersArray[1][0]);
        

        
    }

}

public class P1ArraysInJava{
    public static void main(String[] args) {
        DemoArray  objDemoArray = new DemoArray();
        objDemoArray.Print2DArray();




        
    }
}
