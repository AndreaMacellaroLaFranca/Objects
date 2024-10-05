package house;

public class HouseManagement {
    public static void main(String[] Args){

        Room livingRoom = new Room("Living room",6, 5);
        Room bathRoom = new Room("Bathroom",5, 5);
        Room bedRoom = new Room("Bedroom", 4, 3);

        House villaMare = new House();
        villaMare.name = "Villa su mare";
        villaMare.livingRoom = livingRoom;
        villaMare.bathRoom = bathRoom;
        villaMare.bedRoom = bedRoom;

        System.out.println(livingRoom.roomToString());
        System.out.println(bathRoom.roomToString());
        System.out.println(bedRoom.roomToString());
        System.out.println("\n");

        System.out.println(villaMare.toString());

    }
}
