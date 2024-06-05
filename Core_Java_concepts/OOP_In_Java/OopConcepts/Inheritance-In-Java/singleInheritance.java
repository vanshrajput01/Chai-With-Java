// single Inheritance

class Car{
    String name;
    String color;
    String brand;
    Car(String name,String color,String brand){
        this.name = name;
        this.color = color;
        this.brand = brand;

    }

    void printDetails(){
        System.out.println("Car details is " + this.name + " " + this.color +  " " + this.brand);
    }


}

class EletricCar extends Car{
    String batteryCap;

    public EletricCar(String name ,String color,String brand,String batteryCap) {
        super(name, color, brand);
        this.batteryCap = batteryCap;
    }




    
     

}




public class Main{
    public static void main(String[] args) {
        EletricCar e1Car = new EletricCar("Punch","Red","TATA","200km");
        System.out.println(e1Car.name);
        e1Car.printDetails();


        

        
        
    }
}
