package people;

public class Person {

    public String name, surname, city;
    public int yob;

    public Person() { //costruttore implicito defaul
//
    }

    public Person(String name, String surname, String city, int yob){ //altro costruttore creato, cosstruttore implicito default viene disattivato
            this.name = name;
            this.surname = surname;
            this.city = city;
            this.yob = yob;
        }

        public String toString () {
            return "Ciao sono " + name + " " + surname + " - " + city + ", sono del " + yob + " e ho " + getAge() + " anni";
        }

        public int getAge () {
            return 2024 - yob;
        }

}
