package entite;

import util.Randomiser;

public class Personnage extends EtreVivant {

    private String nom;
    private int score;

    public Personnage() {
        this.setForce(Randomiser.randomizer(12, 18));
        this.setPointsDeVie(Randomiser.randomizer(20, 50));
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "nom='" + nom + '\'' +
                ", force=" + getForce() +
                ", pointsDeVie=" + getPointsDeVie() +
                ", score=" + score +
                '}';
    }
}
