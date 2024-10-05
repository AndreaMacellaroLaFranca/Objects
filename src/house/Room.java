package house;

public class Room {

    public String type;
    public int side1, side2;

    public Room(String type, int side1,int side2){
        this.type = type;
        this.side1 = side1;
        this.side2 = side2;
    }

    public int calculateArea(){
        int area = side1*side2;
        return area;
    }

    public String roomToString(){
        return String.format("The area of your %s is: %dmq.", type,calculateArea());
    }
}
