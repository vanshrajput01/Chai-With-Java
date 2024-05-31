// 1-D Array in java

class DemoArray{
    // Declare Arrays in java
    // one way to declare array in java
    // data type[] nameOfArray = new datatype[size];
    int[] numbersArray = new int[5];
    float pricesArray[] = new float[5];

    



    void  declareIntegerArray(){
        numbersArray[0] = 10;
        numbersArray[1] = 30;
        numbersArray[2] = 20;

        System.out.println(numbersArray[1]);
        

        
    }

    void  declareFloatArray(){
        pricesArray[0] = 10.1f;
        pricesArray[1] = 30.5f;
        pricesArray[2] = 20.67f;

        System.out.println(numbersArray[1]);

        
    }
}

public class P1ArraysInJava{
    public static void main(String[] args) {
        DemoArray  objDemoArray = new DemoArray();
        objDemoArray.declareIntegerArray();
        objDemoArray.declareIntegerArray();




        
    }
}
