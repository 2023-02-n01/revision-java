public class Personnage{


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
        return "Personnage{" +
                "force=" + force +
                ", pointsDV=" + pointsDV +
                ", score=" + score +
                '}';
    }




  /*  static int Random (){

        Random ran = new Random();
        return ran.nextInt(18, 12) + 12;
    }*/


}
