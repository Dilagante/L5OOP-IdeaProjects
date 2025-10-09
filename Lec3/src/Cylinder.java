public class Cylinder {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return (Math.PI * radius * 2 * height) + (Math.PI * radius * radius * 2);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}
