package Полиморфизм;

public abstract class Figure {
    public abstract void draw();
    public abstract void erase ();
}
class Circle extends Figure{


    @Override
    public void draw (){
        System.out.println ("Circle drawn");
    }
    @Override
    public void erase (){
        System.out.println ("Circle erased");
    }
}
class Square extends Figure {

    @Override
    public void draw (){
        System.out.println ("Square drawn");
    }

    @Override
    public void erase() {
        System.out.println ("Square erased");
    }
}
class Painter {
    public static void drawFigure (Figure figure){//принимает
        //объект фигура класса Фигура
        figure.draw();//метод вызывает у фигуры другой метод draw
    }
}
class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();

        Painter.drawFigure(circle);
        Painter.drawFigure(square);

        Figure figure3 = new Circle();
        Figure figure4 = new Square();
        Painter.drawFigure(figure3);
        Painter.drawFigure(figure4);
    }
}