package library;

public class Book extends LibraryItem {

    private String author;
    private int totalPages;

    public Book(String title, String itemID, boolean isBorrowed, String author, int totalPages) {
        super(title, itemID, isBorrowed);
        this.author = author;
        this.totalPages = totalPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public String displayInfo(){
        return String.format("Item: %s %nID: %s %nAuthor: %s %nTotal pages: %d %nBorrowed status: "+ (isBorrowed() ? "Borrowed":"Not borrowed"),getTitle(),getItemID(),getAuthor(),getTotalPages());
    }

}
