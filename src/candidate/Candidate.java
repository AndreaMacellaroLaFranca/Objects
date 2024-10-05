package candidate;

public class Candidate {

    public String name, title, city;
    public boolean provinceCO;
    public int age, son;

    //NEW CONSTRUCTOR
    public Candidate(String name, String title, String city, boolean provinceCO, int age, int son){
        this.name = name;
        this.title = title;
        this.city = city;
        this.provinceCO = provinceCO;
        this.age = age;
        this.son = son;
    }

    public boolean hasMinimumTitle(){
        boolean hasMinimumTitle;
        if (title.equalsIgnoreCase("diploma")||title.equalsIgnoreCase("laurea")||title.equalsIgnoreCase("master")){
            hasMinimumTitle=true;
        }else {
            hasMinimumTitle=false;
        }

        return hasMinimumTitle;
    }

    public int score(){
        int score = 0;

        if (title.equalsIgnoreCase("laurea")){
            score+=10;
        } else if (title.equalsIgnoreCase("master")) {
            score+=20;
        }

        for(int i=0; i<=son; i++){
            score+=10;
        }
        for (int i=0; i<=age; i++){
            score+=1;
        }

        if (provinceCO && city.equalsIgnoreCase("como")){
            score+=30;
        } else if (provinceCO) {
            score+=10;
        }

        return score;

    }

    public String toString(){
        return String.format("Il candidato %s, con titolo %s, che viene da %s, "+(provinceCO ?"in provincia di Como ":"non in provincia di Como. ")+"Ha %d anni e ha %d figli.",name, title, city, age, son);
    }


}
