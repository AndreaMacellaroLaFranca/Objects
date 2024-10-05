package house;

public class House {

    public String name;
    public Room livingRoom, bathRoom, bedRoom;

    public int calculateTotalArea(){
       int totalArea = livingRoom.calculateArea()+ bathRoom.calculateArea()+ bedRoom.calculateArea();
       return totalArea;
    }

    public String toString(){
        return String.format("Casa: %s %n%n%s: %d x %d = %dmq %n%s: %d x %d = %dmq %n%s: %d x %d = %dmq %n%nArea Totale = %dmq",name,livingRoom.type, livingRoom.side1, livingRoom.side2,livingRoom.calculateArea(),bathRoom.type, bathRoom.side1,bathRoom.side2,bathRoom.calculateArea(),bedRoom.type, bedRoom.side1,bedRoom.side2,bedRoom.calculateArea(),calculateTotalArea());
    }
}
