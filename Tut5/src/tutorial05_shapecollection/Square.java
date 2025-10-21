package tutorial05_shapecollection;

public class Square extends GeometricObject {

    protected double side;

    public Square(){
        colour = "blue";
        filled = false;
        side = 1;
    }

    public Square(double s){
        colour = "blue";
        filled = false;
        side = s;
    }

    public Square(double s, String color, boolean filled) {
        colour = color;
        this.filled = filled;
        side = s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double s) {
        side = s;
    }

    @Override
    public String getShape(){
        return "Square";
    }

    @Override
    public double getArea(){
        return side*side;
    }

    @Override
    public double getPerimeter(){
        return 4*side;
    }
}
