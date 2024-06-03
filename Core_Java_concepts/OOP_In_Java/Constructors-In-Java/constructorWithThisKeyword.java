// constructor with this keyword in java

class Car{
    String carName;
    int carPrice;
    String carBrand;
    String carColor;

    // create constructor in java

    Car(String carName,int carPrice,String carBrand,String carColor){
        this.carName =  carName;
        this.carColor =  carColor;
        this.carPrice = carPrice;
        this.carBrand  = carBrand;

    }

    // method

    public void carDetails(){
        System.out.println("Car name :- "+ carName + " Price :- " + carPrice + " Car color :- "+ carColor);
        
    }
}

public class ConstructorE03{
    public static void main(String[] args) {
        Car objCar = new Car("Tata Punch",120000,"Tata","Black");
        objCar.carDetails();
        Car obj01Car = new Car("Tata Heirrer",220000,"Tata","Black");
        obj01Car.carDetails();
        
        
    }

}
