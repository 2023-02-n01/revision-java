package jdr.entites.creatures;

public class Gobelin {

    private Integer force;
    private Integer pointsDV;


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


    @Override
    public String toString() {
        return "Gobelin{" +
                "force=" + force +
                ", pointsDV=" + pointsDV +
                '}';
    }
}
