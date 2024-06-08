
// 1. examples of Throws keyword in java

public class E01ExcetionHandling{
    public static  int getNumberFromArray(int[] arr,int index) throws ArrayIndexOutOfBoundsException {
        return arr[index];





    }
    public static void main(String[] args) {
        int[] tempArray = new int[5];
        int ele;
        try {
            ele = getNumberFromArray(tempArray, 8);
            System.out.println(ele);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }



    }
}

