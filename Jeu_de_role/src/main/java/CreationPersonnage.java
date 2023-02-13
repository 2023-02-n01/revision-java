import entites.Personnage;

public class CreationPersonnage {

    public static void main(String[] args) {

        Personnage personnage = new Personnage();
        personnage.setNom(SaisieUtilisateur.main());
        personnage.setForce(ExempleRandomiserV2.randomizer(12,18));
        personnage.setScore(0);
        personnage.setPointsDV(ExempleRandomiserV2.randomizer(20,50));


        System.out.println(personnage);
    }


}
