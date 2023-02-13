package entite;

public class CaracteristiqueCreature {
    public String getCreature() {
        return creature;
    }

    public void setCreature(String creature) {
        this.creature = creature;
    }

    String creature;
    int force;
    int pointsVie;

    public CaracteristiqueCreature() {
    }

    public CaracteristiqueCreature(int force, int pointsVie) {
        this.force = force;
        this.pointsVie = pointsVie;
        this.creature = creature;
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

    @Override
    public String toString() {
        return "caracteristiqueCreature{" +
                "creature='" + creature + '\'' +
                ", force=" + force +
                ", pointsVie=" + pointsVie +
                '}';
    }
}
