package miage.amai.bowling;

public class Jeu {

    private Essai e1;
    private Essai e2;

    public Jeu(Essai e1, Essai e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    public boolean isValid(){
        if(e1 == null){
            return false;
        }
        if(e1 == null && e2 == null){
            return false;
        }
        if(e2 != null && e1.getNbQuilles() + e2.getNbQuilles() > 10){
            return false;
        }
        if(e1.getNbQuilles() != 10 && e2 == null){
            return false;
        }
        return true;
    }


}
