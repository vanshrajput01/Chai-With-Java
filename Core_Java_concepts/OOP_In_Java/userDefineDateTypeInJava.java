// creating user define calss in java

// /define data type 
class Student{
    String studentName;
    int id;
    String studentClass;

    }

public class userDefineDateTypeInJava{

    static void setSudentDetails(Student s){
        s.id = 102;
        s.studentClass = "X";
        s.studentName = "Rohit";

    }


    public static void main(String[] args) {
        // creating object of class
        Student objStudent = new Student();
        objStudent.id = 101;
        objStudent.studentName = "Rohan";
        System.out.println("Student id is : - "  + objStudent.id); 
        Student obj01Student = new Student();
        setSudentDetails(objStudent); // pass object to function/method in java
        System.out.print("Student details is : - ");
        System.out.println(objStudent.id +" " +  objStudent.studentName);

        


    }

}
