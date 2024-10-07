package people;

public class PeopleManagement {
    public static void main (String[] Args){

        Person guy = new Person();

        guy.name = "Bob";
        guy.surname = "Smith";
        guy.city = "Portland";
        guy.yob = 2000;

        Person gal = new Person();
        gal.name = "Patty";
        gal.surname = "Lee";
        gal.city = "New York";
        gal.yob = 2003;

        Person g = new Person("Gianni","Falco","Pirri",1800);//nuovo costruttore che obbliga ad inserire tutti i campi
        System.out.println(g.toString());

        System.out.println("Ciao sono "+gal.name +" "+gal.surname);

        String guyPresentation = guy.toString();
        System.out.println(guyPresentation);

        String galPresentation = gal.toString();
        System.out.println(galPresentation);

    }
}
