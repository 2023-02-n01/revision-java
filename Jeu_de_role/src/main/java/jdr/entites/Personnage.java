package jdr.entites;

public class Personnage{

   public String nom;

    public Personnage() {
        this.nom = nom;
        this.force = force;
        this.pointsDV = pointsDV;
        this.score = score;
    }

    private Integer force;
   private Integer pointsDV;
   private Integer score;

    public Integer getForce() {
        return force;
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

    @Override
    public String toString() {
        return "jdr.entites.Personnage{" +
                "nom=" + nom +
                "force=" + force +
                ", pointsDV=" + pointsDV +
                ", score=" + score +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



  /*  static int Random (){

        Random ran = new Random();
        return ran.nextInt(18, 12) + 12;
    }*/


}
