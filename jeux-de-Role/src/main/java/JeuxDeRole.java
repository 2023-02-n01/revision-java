import entite.Personnage;
import util.Randomiser;

import java.util.Scanner;

public class JeuxDeRole {
    public static void main(String[] args) {

        System.out.println("Votre choix :");
        String menu = """
                1. Créer un personnage
                2. Combattre une créature
                3. Afficher score;
                4. Sortir;
                """;

        System.out.println(menu);

        Scanner sc = new Scanner(System.in);

        int choix = sc.nextInt();

        Personnage personnage = null;

        switch (choix) {
            case 1:
                System.out.println(" Création d'un personnage");

                personnage = new Personnage();
                System.out.println("Entrer le nom de votre personnage :");
                String nom = sc.next();

                personnage.setNom(nom);
                personnage.setScore(0);

                System.out.println(personnage);
        }
    }
}
