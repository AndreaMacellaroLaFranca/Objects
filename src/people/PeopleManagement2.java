package people;

public class PeopleManagement2 {
    public static void main(String[] Args) {

        Person2 guy = new Person2();

        guy.setName("Gino"); //scrittura
        System.out.println(guy.getName()); //stampa

        guy.setSurname("Smith");
        System.out.println(guy.getSurname());

        guy.setCity("Portland");
        System.out.println(guy.getCity());

        guy.setYob(2001);
        System.out.println(guy.getYob());
    }
}