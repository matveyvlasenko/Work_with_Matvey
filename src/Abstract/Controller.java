package Abstract;

public interface Controller {
double DEFAULT_SPEED = 199999;
double DEFAULT_ANGLE = 90.3;
    double increaseSpeed(double increaseValue);
    double decreaseSpeed (double decreaseValue);
    double changeAngle (double changeAngleValue);
}

class Spaceship implements Controller {

private double currentSpeed= DEFAULT_SPEED;

    @Override
    public double increaseSpeed(double increaseValue) {
return currentSpeed=currentSpeed+increaseValue;
    }
    @Override
    public double decreaseSpeed(double decreaseValue) {
        return currentSpeed= currentSpeed-decreaseValue;
    }
    private double currentAngle= DEFAULT_ANGLE;
    @Override
    public double changeAngle(double changeAngleValue) {
        return currentAngle= currentAngle-changeAngleValue;
    }

}
