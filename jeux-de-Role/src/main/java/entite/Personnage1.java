package entite;

public class Personnage1{
    public static void main(String[] args) {
        Personnage personnage1 = new Personnage();

        personnage1.setForce(5);
        personnage1.setPointsVie(12);
        personnage1.setScore(2);

        System.out.println(personnage1);
    }
}
