package наследование;
public class Vehicle {
    private String color;
    private int speed;

    public Vehicle (){}//по умолчанию
    public Vehicle (String color){
        this.color=color;
    }

    public Vehicle (String color, int speed){
        this.color=color;
        this.speed = speed;
    }
}
class Car extends Vehicle{
    private String model;
    private String owner;
    public Car (String color,int speed, String model, String owner){
        super(color,speed);
        this.model=model;
        this.owner = owner;//конструктор со всеми полями
    }
    public Car ( String model, String owner){
        super();
        this.model=model;
        this.owner = owner;//конструктор только модель, владелец
    }
    public Car (String color,String model, String owner){
        super(color);
        this.model=model;
        this.owner = owner;//конструктор цвет, модель, владелец
    }
    public Car (){
        super();
    }//конструктор без полей
}
