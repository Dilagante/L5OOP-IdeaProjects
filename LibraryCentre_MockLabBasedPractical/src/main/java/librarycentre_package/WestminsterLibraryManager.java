/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarycentre_package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class WestminsterLibraryManager implements LibraryManager {

    // ArrayLists
    public ArrayList<Item> itemList;
    public int item_limit;

    public WestminsterLibraryManager(int maxItemNumber) {
        itemList = new ArrayList<Item>();
        item_limit = maxItemNumber;
    }

    @Override
    public boolean runMenu() {
        boolean exit = false; // Exit flag

        // Run console menu
        System.out.println("\n-- WESTMINSTER LIBRARY MANAGER CONSOLE MENU--");

        System.out.println("To save and exit, press 0");

        System.out.println("To Add a new item, press 1");

        System.out.println("To Display the list of item press 2");

        System.out.println("To Open GUI, press 3");

        System.out.println("To Edit an Item's Title, press 4");


        // Switch based on selected option
        Scanner s = new Scanner(System.in);
        int choice;
        choice = s.nextInt();


        switch (choice) {

            // Exit
            case 0:
                exit = true;
                break;

            // Add staff member
            case 1:
                this.addItem();
                break;
            // Print staff members
            case 2:
                this.displayItems();
                break;

            // GUI
            case 3:
                this.runGUI();
                break;

            case 4:
                this.editTitleItem();
                break;

        }

        return exit;
    }

    @Override
    public void addItem() {
        Scanner s = new Scanner(System.in);

        if (itemList.size() < item_limit) {
            System.out.println("Press 1 if you want to add a Book");
            System.out.println("Press 2 if you want to add a DVD");
            System.out.println("Press 3 if you want to add a Magazine");

            int choiceItem = s.nextInt();
            s.nextLine();

            //common questions
            System.out.println("Enter the Title");
            String title = s.nextLine();

            System.out.println("Enetr the ISBN");
            String isbn = s.nextLine();

            System.out.println("Enter the publication year ");
            int year = s.nextInt();
            s.nextLine();

            // check if the item is a book or a dvd
            switch (choiceItem) {
                case 1:
                    // it is a book
                    System.out.println("Enter the author's name");
                    String author = s.nextLine();

                    // create a new book and add to the list
                    Book book = new Book(title, isbn);
                    book.setAuthor(author);
                    book.setPublicationYear(year);

                    this.addItemToList(book);

                    break;

                case 2:
                    //it is a dvd
                    System.out.println("Enter the genre");
                    String genre = s.nextLine();

                    System.out.println("Enter the director's name");
                    String director = s.nextLine();

                    // create a new receptionist and add to the list
                    DVD dvd = new DVD(title, isbn);
                    dvd.setGenre(genre);
                    dvd.setDirector(director);
                    dvd.setPublicationYear(year);

                    this.addItemToList(dvd);
                    break;

                case 3:
                    System.out.println("Enter the Issue Number: ");
                    int issueNumber = s.nextInt();

                    System.out.println("Enter the Publication Frequency: ");
                    PublicationFrequency publicationFrequency = PublicationFrequency.valueOf(s.nextLine());

                    System.out.println("Enter the Editor's Name");
                    String editor = s.next();

                    Magazine magazine = new Magazine(title, isbn);
                    magazine.setIssueNumber(issueNumber);
                    magazine.setPublicationFrequency(publicationFrequency);
                    magazine.setEditor(editor);

                    this.addItemToList(magazine);
                    break;
            }

        } else {
            System.out.println("No more space in the system");
        }
    }

    public void addItemToList(Item item) {

        //check if there are space avilable
        if (this.itemList.size() < item_limit) {
            itemList.add(item);
        } else {
            System.out.println("No more space in teh list");
        }
    }

    @Override
    public void displayItems() {


        if (!itemList.isEmpty()) {

            Collections.sort(itemList);

            for (Item item : itemList) {
                // print the type of item and the description
                if (item instanceof Book)
                    System.out.print("BOOK - ");
                else if (item instanceof DVD)
                    System.out.print("DVD - ");
                //add here teh code if you added teh class Megazine

                System.out.println(item.toString());
            }
        } else {
            System.out.println("There are no items in the system.");
        }
    }

    @Override
    public void runGUI() {
        ItemTableGUI table = new ItemTableGUI(itemList);
        table.setVisible(true);
    }

    @Override
    public void editTitleItem() {
        System.out.print("Enter the ISBN of the Item: ");
        Scanner s = new Scanner(System.in);
        String ISBNToChange = s.next();

        for (Item i : itemList) {
            if (ISBNToChange.equals(i.getISBN())) {
                System.out.println(i);
                if (i instanceof Book) {
                    System.out.println("Type: Book");
                } else if (i instanceof Magazine) {
                    System.out.println("Type: Magazine");
                } else {
                    System.out.println("Type: DVD");
                }
                System.out.print("Enter the new Title: ");
                String newTitle = s.next();
                i.setTitle(newTitle);
                System.out.println("Done!");
            }

        }

    }

}
