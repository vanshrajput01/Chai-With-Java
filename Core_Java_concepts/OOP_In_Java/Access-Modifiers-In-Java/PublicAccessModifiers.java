// Public access Modifiers in java


public class publicAccessModifierInJava {

    public String str01 = "I am Public mumber!!"; // public member

    // creating print method 
    void printFromClass(){
        System.out.println("With in class : " + str01);
    }
    public static void main(String[] args) {
        publicAccessModifierInJava obj01 = new publicAccessModifierInJava(); // create object of App for call the method of calss App.
        obj01.printFromClass();

        App2 app2obj01 = new App2(); // craete object of class App2 for call the method of App2 class.

        app2obj01.printOutSideClass();

        App3 app3obj01 = new App3(); // craete object of class App2 for call the method of App2 class.

        app3obj01.childClassPrint();



    }

}    

class App2{
    publicAccessModifierInJava appobj = new publicAccessModifierInJava(); // craete app object to get value of str1

    void printOutSideClass(){
        System.out.println("Outside calss :- " + appobj.str01);
    }
    


}

class App3 extends publicAccessModifierInJava{
    publicAccessModifierInJava obj = new publicAccessModifierInJava();

    void childClassPrint(){
        System.out.println("child class :- " + obj.str01);
    }

}
