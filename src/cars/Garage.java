package cars;

public class Garage {
    public static void main (String[] Args){

        Car smart = new Car();
        smart.carName = "Smart";
        smart.licensePlate = "LA2347CV";
        smart.releasedOn = 2010;
        smart.boughtOn = 2010;
        smart.price = 13000;
        smart.km = 1000;
        smart.seats = 2;
        smart.model = "i4";
        smart.engine = "elettrico";

        Car bmw = new Car();
        bmw.carName = "bmw m4";
        bmw.licensePlate = "LA2347CV";
        bmw.releasedOn = 2013;
        bmw.boughtOn = 2022;
        bmw.price = 20000;
        bmw.km = 220000;
        bmw.seats = 4;
        bmw.model = "g1";
        bmw.engine = "turbo benzina";


        System.out.println(smart.toString());
        System.out.println("\n");
        System.out.println(bmw.toString());



    }

}
