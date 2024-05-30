// Private assess modifier in java
// example 01 :- 

public class PrivateAccessModifierInJava{
    private String str1 = "i am private member";
    void printFromClass(){
        System.out.println("with in class : - " + str1);
    } 
    public static void main(String[] args) {
        PrivateAccessModifierInJava obj1AccessModifierInJava = new PrivateAccessModifierInJava();
        obj1AccessModifierInJava.printFromClass();

        App obj1App = new App();
        obj1App.printOutSideClass();
        
    }

}

class App{
        PrivateAccessModifierInJava obj2AccessModifierInJava = new PrivateAccessModifierInJava();



    void printOutSideClass(){
        // System.out.println("with in class : - " + obj2AccessModifierInJava.str1); // that give me error.
    }
    
}




