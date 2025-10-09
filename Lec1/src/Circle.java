public class Circle {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
        else {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    public double getCircumference() {
        return 2*Math.PI*radius;
    }

}
