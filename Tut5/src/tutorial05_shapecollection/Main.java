package tutorial05_shapecollection;

public class Main {
    public static void main(String[] args) {
        ShapeCollection sys = new GeometricShapeCollection(3);
        boolean exit = false;

        while (!exit) {
            exit = sys.runMenu();
        }

    }
}