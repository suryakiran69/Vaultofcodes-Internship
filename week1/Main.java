package Valuteofcodes;

class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        System.out.println("This car is made by "+this.make+" and mode is "+this.model);
    }

    public void start() {
        System.out.println("Starting the car.");
    }
    //Declaring the method stop
    public void stop(){
        System.out.println("Stoping the car");   //Error sloved 
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.start();
        car.stop();  //We have error in this line, We have to declare the method 
    }
}
