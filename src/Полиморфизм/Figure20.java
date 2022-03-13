package Полиморфизм;

public abstract class Figure20 {
    public abstract double calculateSquare();
}
class Circle20 extends Figure20 {
    public Circle20(double radius) {
        this.radius = radius;
    }

    private double radius;
    @Override
    public double calculateSquare (){
        return radius*radius*Math.PI;
    }
}
class Square20 extends Figure20 {
    private double side;

    public Square20(double side) {
        this.side = side;
    }

    @Override
    public double calculateSquare (){
        return side*side;
    }
}
class Rectangle20 extends Figure20{
    private double side1;
    private double side2;

    public Rectangle20(double side1, double side2) {
        this.side1 = side1;
        this.side2=side2;
    }

    @Override
    public double calculateSquare() {
        return side1*side2;
    }
}
class Calculator{
public static double calculateTotalSquare (Figure20[]figures){
    double area = 0;
    for (Figure20 figure:figures){
        area += figure.calculateSquare();
    }
    return area;
}
}
class Main21{
    public static void main(String[] args) {
        Circle20 circle20 = new Circle20 (2);
        Square20 square20 = new Square20 (4);
        Rectangle20 rectangle20= new Rectangle20(4,6);
        Figure20 [] figure20s = {circle20, square20,rectangle20};
        double r = Calculator.calculateTotalSquare(figure20s);
        System.out.println (r);
    }
}
