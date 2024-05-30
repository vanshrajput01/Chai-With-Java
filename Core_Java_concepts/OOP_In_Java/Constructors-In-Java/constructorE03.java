// example of user defined parameterized constructor in java

class Algebra{
    int a;
    int b;

    Algebra(int x , int y) {
        System.out.println("This is Algebra construtor!!");
        a = x;
        b = y; 


    }


    int add(){
        return a+b; 
    }

    int substract(){
        return a - b;
    }



}

public class constructorE01{
    public static void main(String[] args) {
        Algebra obj01Algebra = new Algebra(5,7); // call user defined constructor in java
        System.out.println(obj01Algebra.add());
        System.out.println(obj01Algebra.substract());





       
    }
}
