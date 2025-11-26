import java.util.*;

public class ExceptionHandling2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 0;
        System.out.println("Enter an integer");
        try {
            value = input.nextInt();
        }
        catch (InputMismatchException e) {
            System.err.println("Please enter an Integer");
            return;
        }
        System.out.println("Value: " + value);
    }

}
