package library;

import java.util.Arrays;

public class LibraryManagement {
    public static void main(String[] args) {

        Book book1 = new Book("Book", "Harry Potter", true, "J.K. Rowling", 357);
        Magazine magazine1 = new Magazine("Magazine", "Vogue", true, 22, "Vougue Milan");
        DVD dvd1 = new DVD("DVD", "Starlight", false, 210, "Fantasy");

        Library javaLibrary = new Library(10);

        System.out.println(book1.displayInfo());
        System.out.println("\n");
        System.out.println(magazine1.displayInfo());
        System.out.println("\n");
        System.out.println(dvd1.displayInfo());
        System.out.println("\n");
        System.out.println("\n");

        javaLibrary.addItem(book1);
        javaLibrary.addItem(dvd1);
        System.out.println(Arrays.toString(javaLibrary.getCatalog()));
    }

}
