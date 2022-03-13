package Abstract;

public abstract class Shape {
    private String color;
    public Shape (String color) {
        this.color = color;
    }
    public abstract double calculateArea();
    public  String getColor(){
        return color;
    };//return color of the shape
}
class Circle extends Shape{
    private double radius;
    public Circle (String color, double radius){
        super(color);
        this.radius =radius;
    }
    public static final double PI =Math.PI;

    @Override
    public double calculateArea() {
        return radius*radius*PI;
    }

    public double getRadius() {
        return radius;
    }

    //@Override
    //public String getColor(){
        //return super.getColor();}// когда нужно это вообще?

public double getRadius (double radius){
        return radius;
    }

    public double calculateDiagonal() {
        return radius*2;
    }
}
class Square extends Shape{
    private double sidelength;
    public Square (String color, double sidelength){
        super (color);
        this.sidelength=sidelength;
    }

    @Override
    public double calculateArea() {
        return sidelength*sidelength;
    }

double sqrtOfTwo = Math.sqrt(2);
    public double calculateDiagonal() {
        return sidelength*sqrtOfTwo;
    }

    @Override
    public String getColor() {
        return super.getColor();//это по прежнему не понял
    }
}
class Main22 {
    public static void main(String[] args) {
        Circle circle = new Circle ("Red", 10);
        String color = circle.getColor();
        double radius = circle.getRadius();
    }
}
