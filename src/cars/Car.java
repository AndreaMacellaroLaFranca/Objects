package cars;

public class Car {

    public String carName;
    public String licensePlate;
    public int releasedOn;
    public int boughtOn;
    public float price;
    public int km;
    public int seats;
    public String model;
    public String engine;
    public int currentYear = 2024;


    public float getValue(){

        price = price;
        int carAgeForOwner;
        carAgeForOwner = currentYear-boughtOn;
        float c = price;

        for(int i = 0; i < carAgeForOwner; i++){
            c = price - (price / 10);
            if (c>500) {
                price = price - (price / 10);
            }
        }
        return price;
    }

    public int getAge(){
        int carAge = currentYear - releasedOn;
        return carAge;
    }

    public boolean isDead(){
        boolean isDead;
        if (km>200000 || km>100000 && carName.equalsIgnoreCase("smart")){
            return isDead=true;
        }else {
            return isDead=false;
        }

    }

    public String toString () {
        return "La tua "+carName+" a motore "+engine+", con "+seats+" posti."+" Con targa: "
                +licensePlate+", immatricolata nel "+releasedOn+" e comprata da te nel "
                +boughtOn+" a "+price+"$"+". \nHa attualmente "
                +km+"km. Oggi ha un valore complessivo di $"+getValue()+"."+
                " Il motore e'"+(isDead() ? "morto." : "vivo.");
    }

}


