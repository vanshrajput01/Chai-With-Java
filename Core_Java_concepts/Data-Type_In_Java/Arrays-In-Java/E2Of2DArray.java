// 2-D Array in java
// Example 01 : -

class DemoArray{
    // Declare Arrays in java
    // one way to declare array in java
    // data type[][] nameOfArray = new datatype[size];

    int numberArray[][] = {{1,2,3},{3,4,5}};


    



    void  Print2DArray(){
        numberArray[1][1] = 40;
        System.out.println("Example of Array literal " + numberArray[1][0]);
        System.out.println("Example of Array literal " + numberArray[1][1]);
        

        
    }

}

public class P1ArraysInJava{
    public static void main(String[] args) {
        DemoArray  objDemoArray = new DemoArray();
        objDemoArray.Print2DArray();




        
    }
}
