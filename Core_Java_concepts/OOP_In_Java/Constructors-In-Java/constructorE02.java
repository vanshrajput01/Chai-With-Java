// example of user defined constructor in java

class Algebra{
    int a  = 10;

    Algebra() {
        System.out.println("This is Algebra construtor!!");

    }



}

public class constructorE01{
    public static void main(String[] args) {
        Algebra obj01Algebra = new Algebra(); // call user defined constructor in java
        System.out.println(obj01Algebra.a);




       
    }
}
