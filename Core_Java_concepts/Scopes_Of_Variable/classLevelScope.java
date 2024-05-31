class App{
    int a = 8;
    int b = 10;

    void print(){
        System.out.println(a);
        System.out.println(b);



    }




}

public class ClassLevelScopeInJava{
    public static void main(String[] args){
        App objApp = new App();
        objApp.print();
        //System.out.println(a); // Error because a is declare in call App;



    }
}
