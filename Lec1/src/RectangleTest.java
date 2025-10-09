import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Width: ");
        double width = sc.nextDouble();
        System.out.print("Enter the Height: ");
        double height = sc.nextDouble();

        Rectangle r = new Rectangle(width, height);

        System.out.println("The Area is: " + r.getArea());

        System.out.println("The Perimeter is: " + r.getPerimeter());

        Rectangle r2 = r;

        r2.setWidth(20);

        System.out.println("The Perimeter is: " + r.getPerimeter());
        System.out.println("The Area is: " + r.getArea());


    }
}
