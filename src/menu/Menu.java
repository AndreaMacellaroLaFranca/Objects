package menu;

public class Menu {

    public Dish firstCourse, secondCourse, dessert;

    public Menu(Dish firstCourse, Dish secondCourse, Dish dessert){
        this.firstCourse = firstCourse;
        this.secondCourse = secondCourse;
        this.dessert = dessert;
    }

    public int totalKcal(){
       int totalKcal = firstCourse.kcal()+secondCourse.kcal()+dessert.kcal();
       return totalKcal;
    }

    public int totalPrice(){
        int totalPrice = firstCourse.price+ secondCourse.price+dessert.price;
        return totalPrice;
    }

    public String toString(){
        return String.format("%s: $%d %n%s: $%d %n%s: $%d %nPrezzo totale della cena: $%d %nCalorie totali del menu: %d",firstCourse.name,firstCourse.price,secondCourse.name,secondCourse.price,dessert.name,dessert.price,totalPrice(),totalKcal());
    }


}
