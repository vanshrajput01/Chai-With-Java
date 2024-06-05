// Abstraction
// create abstcation using abstract class

interface Animal{
    final String type = "Animal";
    abstract void walk();

}


class Dog implements Animal {
    

    public void walk(){
        System.out.println("walk on 4 legs!!");
    }
}



public class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.type);
        d.walk();

    }
}
