class Person{
    String name;
    int age;
    String gender;

    public void printInfo(){
        System.out.println("Person details :- " + name + " " + age + " " + gender);
    }

    public void isAdult(){
        if(this.age >= 18 ){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
public class Problem01{
    public static void main(String[] args) {
        Person obj01Person = new Person();
        obj01Person.name = "Rohan";
        obj01Person.gender = "male";
        obj01Person.age = 20;
        obj01Person.isAdult();
        obj01Person.printInfo();
        obj01Person.age = 15;
        obj01Person.isAdult(); 

        
    }
    
}
