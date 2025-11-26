import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<Book>();

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.print("Enter 1 to add a Book. Enter 0 to exit. Enter 2 to Sort: ");

            int add = s.nextInt();

            switch (add) {
                case 1:
                    Book test = null;

                    System.out.print("Enter the book title: ");
                    String title = s.next();
                    System.out.print("Enter the Price: ");
                    double price = s.nextDouble();
                    System.out.print("Enter the Published Year: ");
                    int year = s.nextInt();
                    System.out.print("Enter the Book's Author: ");
                    String author = s.next();

                    test = new Book(title,price,year,author);

                    bookList.add(test);
                    System.out.println("Book added!");
                    continue;
                case 2:
                    Collections.sort(bookList);
                    System.out.println(bookList);
                    continue;
                case 0:
                    System.out.println("Exiting...");
                    break;
            }
            break;
        }

    }
}