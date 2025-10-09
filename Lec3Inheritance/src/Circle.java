public class Circle {

    private double radius;
    //If you want to access Instance Variable from the Subclass, make it protected

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getCircumference(){
        return Math.PI*radius*2;
    }
}
