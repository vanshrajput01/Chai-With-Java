// Protected access modifier in java

public class ProtectedAccessModifiers{
    protected String str1 = "I am a protected mumber";

    void printFromClass(){
        System.out.println("Print from class :-" + str1);
    }


    public static void main(String[] args) {
        ProtectedAccessModifiers obj1ProtectedAccessModifiers = new ProtectedAccessModifiers();
        System.out.println(obj1ProtectedAccessModifiers.str1);
        obj1ProtectedAccessModifiers.printFromClass();
        App objOfApp = new App();
        objOfApp.printOutSideClass();

    
    }
}

class App{
    void printOutSideClass(){
        ProtectedAccessModifiers obj1ProtectedAccessModifiers = new ProtectedAccessModifiers();
        System.out.println(obj1ProtectedAccessModifiers.str1);
        obj1ProtectedAccessModifiers.printFromClass();

    
    }

}
