package lk.dilhara.oop.week2;
public class Circle {
    private double radius; //This is an Instance Variable
    private static int counter; //This is a Static Variable

    public Circle() {
        super();
        this.radius = 1.0;
        counter += 1;
    }

    public Circle(double radius){
        this.radius = radius;
        counter += 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setRadius(int scale){
        this.radius = this.radius*scale;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static int getCounter(){
        return counter;
    }

    public double getArea(double r){
        return Math.PI * r * r;
    }

}













