package menu;

public class DishManagement {
    public static void main(String[] Args){
        
        Dish bolognese = new Dish("Bolognese",91,12,30,15);
        Dish chickenWings = new Dish("Ali di pollo fritte",40,35,30,18);
        Dish cheeseCake = new Dish("Cheese cake",80,5,25,7);

        System.out.println(bolognese.toString());
        System.out.println(chickenWings.toString());
        System.out.println(cheeseCake.toString());
        System.out.println("\n");

        //FORMATTAZIONE BASE
        System.out.println(bolognese.name+": $"+bolognese.price+"\n"+
                           chickenWings.name+": $"+ chickenWings.price+"\n"+
                           cheeseCake.name+": $"+ cheeseCake.price+"\n"+
                           "Prezzo totale della cena: $"+
                           (bolognese.price+ chickenWings.price+ cheeseCake.price)+"\n"+
                           "Kcal totali del menu: "+
                           (bolognese.kcal()+ chickenWings.kcal()+ cheeseCake.kcal()));
        System.out.println("\n");


        //FORMATTAZIONE CON CLASSE MENU
        Menu menu = new Menu(bolognese,chickenWings,cheeseCake);
        System.out.println(menu.toString());

    }
}
