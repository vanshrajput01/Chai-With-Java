

// example of user defined parameterized constructor in java

class Car{
    String cName;
    String cBrand;
    String cModel;
    int cPrice;

    // here create constructor of car class
    Car(String carName,String carBrand,String carModel,int carPrice){
        cName = carName;
        cBrand = carBrand;
        cModel = carModel;
        cPrice = carPrice;


    }

    void printCarDetails(){
        System.out.println("Car details is :- " + "Car name is " + cName + " Car Brand is " + cBrand);
    }
}

public class constructorE02{

    public static void main(String[] args) {
        Car obj1Car = new Car("punch","Tata","Top",120000);
        System.out.println(obj1Car.cName);
        obj1Car.printCarDetails();
    }






       
    }
