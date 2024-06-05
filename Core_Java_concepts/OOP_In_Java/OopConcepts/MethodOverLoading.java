// ploymorshipm 
// complie time polymorphism
//example of method overloading 
class Student{
    String name;
    int id;
    
    void printDetails(String name){
        System.out.println("Student name is " + name);

    }

    void printDetails(int id){
        System.out.println("student id is " + id);


    }
    void  printDetails(String name , int id){
        System.out.println("student full details is " + name + " " + id );
    }

    
}


public class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printDetails(101);
        s1.printDetails("Rohan das");
        s1.printDetails("Rohan", 103);

        

        
        
    }
}
