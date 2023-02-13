import entites.Personnage;

import java.util.Objects;
import java.util.Scanner;

public class CreationPersonnage {

    public static void main(String[] args) {
        nouveauPerso();


    }

    public static Personnage personnage = new Personnage();

    public static void nouveauPerso(){
        personnage.setNom(SaisieUtilisateur.main());
        personnage.setForce(ExempleRandomiserV2.randomizer(12, 18));
        personnage.setScore(0);
        personnage.setPointsDV(ExempleRandomiserV2.randomizer(20, 50));

        System.out.println(personnage);

        refairePerso();

    }



    private static void refairePerso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez vous créer un nouveau personnage?'y' 'n' ");
        String yesNo ;
        yesNo = scanner.nextLine();
        switch (yesNo) {
            case "y" -> nouveauPerso();
            case "n" -> {System.out.println("Retour au menu");
            MenuPrincipal.choixMenu();}

        }

    }
}
