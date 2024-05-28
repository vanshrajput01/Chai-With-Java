// How to create class and object 
// Person class
class Person{
    int age = 20;
    String name = "Bob";
}

// Main class
public class Main{
    public static void main(String[] args){
        Person obj01 = new Person(); // create object of Person class
        System.out.println(obj01.age);
        System.out.println(obj01.name); // . use to access attributes of class

    }

}

