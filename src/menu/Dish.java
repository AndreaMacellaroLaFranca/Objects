package menu;

public class Dish {

    public String name;
    public int carbs, proteins, fats, price;

    //NEW CONSTRUCTOR
    public Dish(String name, int carbs,int proteins, int fats, int price){
        this.name = name;
        this.carbs = carbs;
        this.proteins = proteins;
        this.fats =  fats;
        this.price = price;
    }

    //METHODS
    public int kcal(){
        int kcal = carbs*4+proteins*4+fats*9;
        return kcal;
    }

    public String toString(){
        return String.format ("%s: $%d%n"+kcal()+" Kcal totali del piatto.%n",name,price);
    }

}
