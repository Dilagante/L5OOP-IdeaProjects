package second;

public class TutorialCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        System.out.println("The Area is: " + c1.getRadius());
        System.out.println("The Radius is: " + c1.getArea());
        System.out.println("The Color is: " + c1.getColor());

        Circle c2 = new Circle(1.231);

        System.out.println("The Area is: " + c1.getRadius());
        System.out.println("The Radius is: " + c1.getArea());
        System.out.println("The Color is: " + c1.getColor());

        Circle c3 = new Circle(4.58,"Green");

        System.out.println("The Area is: " + c3.getRadius());
        System.out.println("The Area is: " + c3.getArea());
        System.out.println("The Color is: " + c3.getColor());

        c3.setColor("Black");
        c3.setRadius(3.999);

        System.out.println("The Color is: " + c3.getColor());
        System.out.println("The Radius is: " + c3.getRadius());

        System.out.println(c3);


    }
}
