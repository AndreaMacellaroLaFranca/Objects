package library;

public class Magazine extends LibraryItem {

    private int issueNumber;
    private String publisher;

    public Magazine(String title, String itemID, boolean isBorrowed, int issueNumber, String publisher) {
        super(title, itemID, isBorrowed);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public java.lang.String getPublisher() {
        return publisher;
    }


    public String displayInfo(){
        return String.format("Item: %s %nID: %s %nIssue number: %d %nPublisher: %s %nBorrowed status: "+ (isBorrowed() ? "Borrowed":"Not borrowed"),getTitle(),getItemID(),getIssueNumber(),getPublisher());
    }


}
