// single Inheritance

class Animal{
    String name;
    int age;

    void makeSound(){
        System.out.println("Some generic animal sound");
    }

    void info(){
        System.out.println(this.name + " " + this.age);
    }





}

class Dog extends Animal{
    String breed;

    void makeSound(){
        System.out.println("Bark");
    }

    void DogInfo(){
        System.out.println(this.breed);
    }
}





    
     






public class Main{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "tommy";
        d1.age = 5;
        d1.breed = "no";
        d1.info();
        d1.DogInfo();
        d1.makeSound();
        


        

        
        
    }
}
