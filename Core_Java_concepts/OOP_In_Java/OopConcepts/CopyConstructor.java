// class and object concepts in java
class Student{
    String name;
    String id;

    Student() {

    }

    
    // cop constructor
    Student(Student s){
        this.name = s.name;
        this.id = s.id;


    }


    void getStudentDetails(){
        System.out.println("Student details : - " + this.name + " " + " " + this.id);
    }
    


}


public class Main{
    public static void main(String[] args){
        // create object
        Student objStudent = new Student();
        objStudent.name = "Rohan";
        objStudent.id = "12vsfdk";
        objStudent.getStudentDetails();
        Student obj01Student = new Student(objStudent); 
        obj01Student.getStudentDetails();



        
    }

}
