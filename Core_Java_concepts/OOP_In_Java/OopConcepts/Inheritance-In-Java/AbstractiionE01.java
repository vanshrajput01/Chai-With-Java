// Abstraction
// create abstcation using abstract class

abstract class Animal{
    abstract void walk();

    Animal(){
        System.out.println("Animal constructor");
    }

}


class Dog extends Animal {
    void walk(){
        System.out.println("walk on 4 legs!!");
    }
}



public class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.walk();
        // Animal a = new Animal(); Error this is abstract class;
    }
}
