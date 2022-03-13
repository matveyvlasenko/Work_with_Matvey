package наследование;

public class Shapes {
    private String color;
    public Shapes (String color){
        this.color=color;
    }
    public double calculateSquare (){
        return 0.0;
    }
    public String getColor (){
        return color;
    }
}
class Square extends Shapes {
    private double sideLength;
    public Square (String color, double sideLength) {
        super(color);
        this.sideLength=sideLength;
    }
    @Override//??
    public double calculateSquare (){//вот здесь не понимаю, public/private?
        System.out.println(sideLength*sideLength);
        return sideLength*sideLength;
    }
}
class Circle extends Shapes {
    private double radius;
    public static final double PI=Math.PI;
    public Circle (String color, double radius){
        super (color);
        this.radius = radius;
    }
    @Override//??
    public double calculateSquare (){
        System.out.println (radius*radius *PI);
        return radius*radius *PI;
    }
}
class Main11{
    public static void main(String[] args) {
        Shapes shape1 = new Shapes("red");
        Square square1 = new Square ("green",2.4);
        Circle circle1= new Circle ("red", 3.09);
        shape1.calculateSquare();
        square1.calculateSquare();//не понимаю здесь - нужно повторять поле как параметр?
        circle1.calculateSquare();
    }
}

