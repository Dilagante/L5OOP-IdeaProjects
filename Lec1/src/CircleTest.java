import java.util.Scanner;

public class CircleTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle c = new Circle(radius);

        System.out.println("The Area is: " + c.getArea());
        System.out.println("The Circumference is: " + c.getCircumference());

    }
}
