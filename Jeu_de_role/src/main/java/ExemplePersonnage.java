public class ExemplePersonnage {

    public static void main(String[] args) {

        Personnage personnage = new Personnage();
        new SaisieUtilisateur();

        personnage.getNom(SaisieUtilisateur.main());
        personnage.getForce();
        personnage.getScore();
        personnage.getPointsDV();


        System.out.println(personnage);
    }


}
