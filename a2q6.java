package assignment2;
class Vehicle{
    String model;
    int year;
    public Vehicle(String model,int year) {
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle{
    int carId;
    double price;
    public Car(String model,int year,int carId,double price){
        super(model, year);
        this.carId=carId;
        this.price=price;
    }
    public void carDisplay(){
        System.out.println("Vehicle Model: " + model);
        System.out.println("Vehicle Year: " + year);
        System.out.println("Car ID: " + carId);
        System.out.println("Car Price: " + price);
    }
}
public class a2q6 {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla Model S", 2023, 101, 79999.99);
        myCar.carDisplay();
    }
}


