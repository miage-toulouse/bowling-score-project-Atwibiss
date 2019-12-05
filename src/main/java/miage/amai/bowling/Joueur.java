package miage.amai.bowling;

import java.util.List;

public class Joueur {

    private List<Jeu> listeJeux;
    private IScore calculerScore;

    public Joueur(List<Jeu> listeJeux, IScore calculerScore){
        this.listeJeux = listeJeux;
        this.calculerScore = calculerScore;
    }

}
