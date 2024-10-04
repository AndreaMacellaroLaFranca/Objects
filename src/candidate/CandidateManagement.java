package candidate;

public class CandidateManagement {
    public static void main(String[] Args){

        
        Candidate primoCandidato = new Candidate("Franco", "master", "como", true, 35, 0);
        Candidate secondoCandidato = new Candidate("Roberto", "master", "Cagliari", false,35,2);


        System.out.println(primoCandidato.toString());
        System.out.println(secondoCandidato.toString());

        if(!primoCandidato.hasMinimumTitle(primoCandidato.title) && !secondoCandidato.hasMinimumTitle(secondoCandidato.title)){
            System.out.println("Ci dispiace nessuno di voi è idoneo.");
        }else if (primoCandidato.hasMinimumTitle(primoCandidato.title) && !secondoCandidato.hasMinimumTitle(secondoCandidato.title)){
            System.out.println("Congratulazione "+primoCandidato.name+" hai passato la selezione!");
        } else if (!primoCandidato.hasMinimumTitle(primoCandidato.title) && secondoCandidato.hasMinimumTitle(secondoCandidato.title)) {
            System.out.println("Congratulazione "+secondoCandidato.name+" hai passato la selezione!");
        }else {
            if (primoCandidato.score() > secondoCandidato.score()){
                System.out.println("Congratulazione "+primoCandidato.name+" hai passato la selezione!");
            }else {
                System.out.println("Congratulazione "+secondoCandidato.name+" hai passato la selezione!");
            }
        }


    }
}
