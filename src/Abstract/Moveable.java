package Abstract;

public interface Moveable {
    double DEFAULT_SPEED = 5.0;
    void move();

}
interface Jumpable {
    void jump ();
}
class Human implements Jumpable, Moveable{
private double walkingSpeed =6;

    //public double move(int int1) {}//метод может ничего не принимать в базовом, но
        //принимать в дочернем классе?



    @Override
    public void jump() {

    }

    @Override
    public void move() {

    }
}
