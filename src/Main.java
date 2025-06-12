class Vehicle{
    String brand;
    public Vehicle(String brand){
        this.brand = brand;
    }
    public void display(String brand){
        System.out.println("이차의 brand:"+brand);
    }
}

class Car extends Vehicle{
    String model;

    public Car(String brand,String model){
        super(brand);
        this.model = model;
        }
    }


public class Main {
    public static void main(String[] args) {
        Car cr = new Car("현대","코레일");
        cr.display("현대");





    }
}