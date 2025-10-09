//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle obj = new Circle(3.2); //3.2 is an argument

        System.out.println("Area: " + obj.getArea());

        obj = new Cylinder(3.2,4.4);

        System.out.println("Area: " + obj.getArea());

        System.out.println("Volume: " + ((Cylinder)obj).getVolume());
        
    }
}