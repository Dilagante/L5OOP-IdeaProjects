import java.util.Scanner;

public class CalculatePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Width: ");
        double width = sc.nextDouble();
        System.out.print("Enter the Length: ");
        double length = sc.nextDouble();

        double perimeter = getPerimeter(length, width);
        double area = getArea(length, width);

        System.out.println("The Perimeter is: " + perimeter);
        System.out.println("The Area is: " + area);

    }
    public static double getPerimeter(double length, double width) {
        double perimeter = (length*2) + (width*2);
        return perimeter;
    }

    public static double getArea(double length, double width) {

        double area = length*width;
        return area;
    }
}
