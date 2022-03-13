package Полиморфизм;

public abstract class Car {
    public abstract void start ();
    public abstract void stop();
}
class Toyota extends Car{

    @Override
    public void start() {
        System.out.println ("Toyota started");
    }

    @Override
    public void stop() {
        System.out.println ("Toyota stopped");
    }
}
class Ford extends Car{
    @Override
    public void start() {
        System.out.println ("Ford started");
    }

    @Override
    public void stop() {
        System.out.println ("Ford stopped");
    }
}
class Driver {
    public static void manageCar (Car car){
        car.start();
    }
}
class Main2 {
    public static void main(String[] args) {
        Car car1 = new Ford();
        Car car2 = new Toyota();
        Driver.manageCar(car1);
        Driver.manageCar(car2);


    }
}