// getter method in java

class Company{
    int empId;
    String empName;
    // private Access modifer in java
    private int empSalary;

    // getter method in java

    public void getSalary(){
        System.out.println(empSalary);
    } 

}


public class GetterAndSetterMethodInJava{
    public static void main(String[] args) {
        Company emp01 = new Company();
        emp01.empId = 101;
        emp01.empName = "Mark Wood";
        System.out.println("employee details is :- " + emp01.empName + " " + emp01.empId);
        // emp01.empSalary = 70000; Error because this is private variable not accss outside of calss
        // using gette method to access private attributes of comapny class
        emp01.getSalary(); 

        

    
    }


}
