public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
        else {
            throw new IllegalArgumentException("Width must be greater than 0");
        }

    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
        else {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * width + 2 * length;
    }
}
