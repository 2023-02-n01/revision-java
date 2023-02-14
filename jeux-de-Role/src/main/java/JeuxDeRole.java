import entite.*;
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

        Personnage personnage = new Personnage();
        Monstre monstre = null;

        while (true) {
            int choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println(" Création d'un personnage");

//                  personnage = new Personnage();
                    System.out.println("Entrer le nom de votre personnage :");
                    String nom = sc.next();
                    personnage.setNom(nom);
                    personnage.setScore(0);

                    System.out.println(personnage);

                    System.out.println(menu);
                    break;

                case 2:
                    String choixMonstre = """
                            1 - Loup
                            2 - Gobelin
                            3 - Troll
                            """;
                    System.out.println(choixMonstre);

                    int choixAnimal = Randomiser.randomizer(1, 3);

                    if(choixAnimal == 1){
                        monstre = new Loup();
                    } else if (choixAnimal == 2){
                        monstre = new Gobelin();
                    } else {
                        monstre = new Troll();
                    }

                    System.out.println("Vous allez combattre le :" + monstre);

                    System.out.println(menu);
                    break;

                case 3:
                    System.out.println("Le score de votre personnage est de :" + personnage.getScore());

                    System.out.println(menu);
                    break;
                case 4:

                default:
                    System.exit(0);
                    break;
            }
        }
    }
}
