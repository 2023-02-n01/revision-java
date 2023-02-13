package entite;

import java.util.Scanner;

public class Personnage1{
    public static void main() {
        Personnage personnage1 = new Personnage();

        personnage1.setNom(ExempleScanner.afficheNom());
        personnage1.setForce(ExempleRandom.randomizer(12, 18));
        personnage1.setPointsVie(ExempleRandom.randomizer(20, 50));
        personnage1.setScore(0);

        System.out.println(personnage1);

    }


//        System.out.println("Créer votre personnage");
//
//        System.out.println("Entrer votre nom :");
//        Scanner sc = new Scanner(System.in);
//        String nom = sc.nextLine();
//
//        Personnage personnage2 = new Personnage();
//        personnage2.setForce(ExempleScanner.afficheNb());
//        personnage2.setPointsVie();
//
}