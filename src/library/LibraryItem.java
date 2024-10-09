package library;

public class LibraryItem {

    private String title, itemID;
    private boolean isBorrowed;

    //CONSTRUCTOR
    public LibraryItem(String title, String itemID, boolean isBorrowed) {
        this.title = title;
        this.itemID = itemID;
        this.isBorrowed = isBorrowed;
    }

    //GETTER AND SETTERS
    public String getTitle() {
        return title;
    }

    public String getItemID() {
        return itemID;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    //METHODS
    public boolean borrowItem(String itemID){
        if (isBorrowed){
            System.out.println("Item already borrowed by someone else.");
        } else {
            System.out.println("You succesfully borrowed this item!");
            return isBorrowed = true;
        } return isBorrowed;
    }

    public boolean returnItem(String itemID){
        if(isBorrowed){
            System.out.println("Thank you for returning the item!");
            isBorrowed = false;
        } return isBorrowed;
    }

    public String displayInfo(){
        return String.format("Item: %s %nID: %s %nBorrowed status: "+ (isBorrowed() ? "Borrowed":"Not borrowed"),title,itemID);
    }




}
