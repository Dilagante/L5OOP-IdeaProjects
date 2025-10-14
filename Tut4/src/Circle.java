public class Circle {

    private double radius = 1.0;
    private String color = "Blue";

    public Circle() {

    }

    public Circle(double r) {
        radius = r;
    }

    public Circle(double r, String colour) {
        radius = r;
        this.color = colour;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Radius = " + radius + ", Color = " + color;
    }

}
