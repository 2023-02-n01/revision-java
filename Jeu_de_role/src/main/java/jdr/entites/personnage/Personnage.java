package jdr.entites.personnage;

public class Personnage{

   public String nom;

    public Personnage() {
        this.nom = nom;
        this.force = force;
        this.pointsDV = pointsDV;
        this.score = score;
        this.mana = mana;
    }

    private Integer force;
   private Integer pointsDV;
   private Integer score;
   private Integer mana;

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

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
        return "Héros{" +
                "nom=" + nom + " " +
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
