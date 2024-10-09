package library;

public class Library {

    private LibraryItem[] catalog;
    private int catalogSize;  // To keep track of the current number of items

    // Constructor to initialize the catalog
    public Library(int size) {
        catalog = new LibraryItem[size];  // Initialize the array with a given size
        catalogSize = 0;  // Start with no items in the catalog
    }

    public LibraryItem[] getCatalog() {
        return catalog;
    }

    // Add an item to the catalog
    public void addItem(LibraryItem item) {
        if (catalogSize < catalog.length) {
            catalog[catalogSize] = item;  // Add the item at the current index
            catalogSize++;  // Increment the size counter
            System.out.println("Item added to the catalog:");
            System.out.println(item.displayInfo());
        } else {
            System.out.println("The catalog is full, cannot add more items.");
        }
    }
}