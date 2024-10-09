package library;

public class Library {

    private LibraryItem[] catalog;

    public void addItem (LibraryItem item){
        System.out.println("Library catalog: \n");
        for(int i = 0; i<catalog.length ;i++){
            catalog[i] = item;
            item.displayInfo();
            System.out.println();
        }
    }

}
