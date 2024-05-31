// This is example of method level scope in java 

class App{
    int a = 8;
    int b = 10;

    void print(){
        System.out.println(a+b);
        int x = 20;
        int y = 30;



    }

    void sub(){
        int z = x - y;  // that give me error because that are declare in add method 
    }




}

public class ClassLevelScopeInJava{
    public static void main(String[] args){
        App objApp = new App();
        objApp.print();



    }
}
