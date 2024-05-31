// 1-D Array in java

class DemoArray{
    // Declare Arrays in java
    // one way to declare array in java
    // data type[] nameOfArray = new datatype[size];
    int[] numbersArray = new int[5];
    float pricesArray[] = new float[5];

    // Array literal in java

    int numbers[] = {1,2,3,4,5};

    



    void  ArraysLiterals(){
        numbersArray[0] = 10;
        numbersArray[1] = 30;
        numbersArray[2] = 20;
        System.out.println("Example of Array literal " + numbers[1]);
        

        
    }

}

public class P1ArraysInJava{
    public static void main(String[] args) {
        DemoArray  objDemoArray = new DemoArray();
        objDemoArray.ArraysLiterals();




        
    }
}
