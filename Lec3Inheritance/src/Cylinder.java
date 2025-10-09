public class Cylinder extends Circle {
    //Cylinder is the subclass/child/derived class
    //Circle is the superclass/parent/base class

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Method Override means the method is inherited from the superclass and subclass redefines it
    //When the method is overridden, you cannot narrow the access specifier
    //You also cannot change the return type (unless it is a co-variant return type)
    //Name of the Method cannot be changed, parameter cannot be changed
    //If you change the parameter, it becomes Method Overloading - not Overriding
    @Override
    public double getArea(){
        return (Math.PI * getRadius() * 2 * height) + (Math.PI * getRadius() * getRadius() * 2);
    }

    //When you inherit a method from the superclass, but it is not supported by the subclass, override and throw UnsupportedOperationException
    @Override
    public double getCircumference() {
        throw new UnsupportedOperationException("getCircumference Operation is not supported by Cylinder");
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }
}
