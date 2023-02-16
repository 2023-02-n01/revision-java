package jdr.entites.global;

public abstract class EtreVivant {

    private String nom;
    private Integer force;
    private Integer pointsDV;
    private Integer score;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    @Override
    public String toString() {
        return "EtreVivant{" +
                "nom=" + nom +
                "force=" + force +
                ", PointsDV=" + pointsDV +
                "score=" + score +
                '}';
    }

    public Integer getForce() {
        return force;
    }

    public EtreVivant(String nom, Integer force, Integer pointsDV, Integer score) {
        this.nom = nom;
        this.force = force;
        this.pointsDV = pointsDV;
        this.score = score;
    }

    public void setForce(Integer force) {
        this.force = force;
    }

    public Integer getPointsDV() {
        return pointsDV;
    }

    public void setPointsDV(Integer pointsDV) {
        this.pointsDV = pointsDV;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
