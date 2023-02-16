package entite;

import util.Randomiser;

public class Personnage extends EtreVivant {

    private String nom;

    public Personnage() {
        this.setForce(Randomiser.randomizer(12, 18));
        this.setPointsDeVie(Randomiser.randomizer(20, 50));
        this.getScore();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "nom : " + nom +
                ", force : " + getForce() +
                ", pointsDeVie : " + getPointsDeVie() +
                ", score : " + getScore();
    }
}
