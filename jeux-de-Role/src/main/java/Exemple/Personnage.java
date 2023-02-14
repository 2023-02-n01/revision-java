package Exemple;

public class Personnage {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private String nom;
    private int force;
    private int pointsVie;
    private int score = 0;

    public Personnage() {
    }

    public Personnage(int force, int pointsVie, int score) {
        this.nom = nom;
        this.force = force;
        this.pointsVie = pointsVie;
        this.score = score;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointsVie() {
        return pointsVie;
    }

    public void setPointsVie(int pointsVie) {
        this.pointsVie = pointsVie;
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
                ", force=" + force +
                ", pointsVie=" + pointsVie +
                ", score=" + score +
                '}';
    }
}
