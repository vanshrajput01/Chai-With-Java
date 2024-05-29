// Create car class 


class Car{
    String carCompanyName = "TATA";
    String carName = "Punch";
    String carColor = "black";

    void carDetails(){
        System.out.println("This is best model of tata brand!!");
    }
}

public class Main{
    public static void main(String[] args){
        Car car01 = new Car();
        System.out.println(car01.carColor);
        car01.carDetails();
        




    }
}
