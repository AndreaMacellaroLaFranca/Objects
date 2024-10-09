package library;

public class DVD extends LibraryItem{

    private int durationMinutes;
    private String genre;

    public DVD(String title, String itemID, boolean isBorrowed, int durationMinutes, String genre) {
        super(title, itemID, isBorrowed);
        this.durationMinutes = durationMinutes;
        this.genre = genre;

    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getGenre() {
        return genre;
    }

    public String displayInfo(){
        return String.format("Item: %s %nID: %s %nGenre: %s %nDuration: %dmin %nBorrowed status: "+ (isBorrowed() ? "Borrowed":"Not borrowed"),getTitle(),getItemID(),getGenre(),getDurationMinutes());
    }
}
