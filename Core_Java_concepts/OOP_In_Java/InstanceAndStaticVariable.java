// Static varible and instances veriable. 


public class Main{
    // instance variable
    int a = 4;
    int b = 5;
    // static variable
    static int c = 10;
    int addNumber(){
        return a + b;


    }
    public static void main(String[] args){
        Main obj01Main = new Main();
        System.out.println(obj01Main.addNumber());
        System.out.println(obj01Main.a);
        obj01Main.a = 11;
        System.out.println(obj01Main.a);
        System.out.println(obj01Main.addNumber());
        //System.out.println(a); // that give me error
        System.out.println(c);
        Main obj02Main = new Main();
        System.out.println(obj02Main.addNumber());


    }
}
