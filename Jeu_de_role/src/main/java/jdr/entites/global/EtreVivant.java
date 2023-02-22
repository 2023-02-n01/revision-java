package jdr.entites.global;

public abstract class EtreVivant {

    private String nom;
    private Integer force;
    private Integer pointsDV;
    private Integer score;
    private Integer gils;

    public Integer getGils() {
        return gils;
    }

    public void setGils(Integer gils) {
        this.gils = gils;
    }

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
                ", force=" + force +
                ", PointsDV=" + pointsDV +
                ", score=" + score +
                ", gils=" + gils +
                '}';
    }

    public Integer getForce() {
        return force;
    }

    public EtreVivant(String nom, Integer force, Integer pointsDV, Integer score, Integer gils) {
        this.nom = nom;
        this.force = force;
        this.pointsDV = pointsDV;
        this.score = score;
        this.gils = gils;
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
