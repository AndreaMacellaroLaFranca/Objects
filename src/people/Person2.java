package people;

public class Person2 {
        //public --> possiamo vederlo ovunque
        //private --> possiamo vederlo solo all'interno della classe
        private String name, surname, city;
        private int yob;

        public String getName(){ //metodo getter
            return name;
            //getter --> lettura
        }

        public void setName(String name){
            this.name = name;
            //setter --> scrittura
        }

        public String getSurname(){
            return surname;
        }

        public void setSurname(String surname){
            this.surname = surname;
        }

        public String getCity(){
            return city;
        }

        public void setCity(String city){
            this.city = city;
        }

        public int getYob(){
            return yob;
        }

        public void setYob(int yob){
            this.yob = yob;
        }

        public Person2() { //costruttore implicito defaul
//
        }

    public Person2(String name, String surname, String city, int yob){ //altro costruttore creato, cosstruttore implicito default viene disattivato
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
