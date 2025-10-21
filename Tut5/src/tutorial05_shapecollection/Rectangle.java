package tutorial05_shapecollection;

public class Rectangle extends GeometricObject{

    protected double length;
    protected double width;

    public Rectangle(){
        colour = "blue";
        filled = false;
        length = 1;
        width = 1;
    }

    public Rectangle(double length, double width){
        colour = "blue";
        filled = false;
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
        this.length = length;
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public String getShape(){
        return "Rectangle";
    }

    @Override
    public double getArea(){
        return Math.PI*length*width;
    }

    @Override
    public double getPerimeter(){
        return 2*(length+width);
    }
}
