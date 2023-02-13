package jdr.entites.creatures;

public class Loup {

    private Integer force;
    private Integer pointsDV;


    @Override
    public String toString() {
        return "Loup{" +
                "force=" + force +
                ", pointsDV=" + pointsDV +
                '}';
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

}