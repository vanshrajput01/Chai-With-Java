// class and object concepts in java
class Student{
    String name;
    String id;

    Student(String name , String id){
        this.name = name;
        this.id = id;


    }

    void getStudentDetails(){
        System.out.println("Student details : - " + this.name + " " + " " + this.id);
    }
    


}


public class Main{
    public static void main(String[] args){
        // create object
        Student objStudent = new Student("Rohan" , "123dxer");
        objStudent.getStudentDetails(); 


        
    }

}
