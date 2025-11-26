public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        int myArray[] = new int[5];
        try {
            System.out.println(myArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("The element " + e.getMessage() + " does not exist");
        }
    }
}