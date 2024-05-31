// This is example of Block level scope in java 

class App{
    int x = 8;
    int y = 10;


    {
        float a = 20.0f; // this is example of block level scope in java 

    }

    void print(){
        System.out.println(x+y);
        System.out.println(a); // error




    }






}

public class ClassLevelScopeInJava{
    public static void main(String[] args){
        App objApp = new App();
        objApp.print();



    }
}
