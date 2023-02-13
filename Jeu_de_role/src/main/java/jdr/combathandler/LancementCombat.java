package jdr.combathandler;

import jdr.entites.creatures.CreationCreatures;

import java.util.Scanner;

public class LancementCombat {

    public static void main() {
        creationMonstre();

    }


    public static int creationMonstre() {
        int monstre = Randomiser.randomizer(1,3);
        //return monstre;



        switch (monstre) {

            case 1:
                CreationCreatures.creationLoup();
                debutCombat();
                break;
            case 2:
                CreationCreatures.creationGobelin();
                debutCombat();
                break;
            case 3:
                CreationCreatures.creationTroll();
                debutCombat();
                break;


        }
    }

    public static void debutCombat() {
        System.out.println("Choose your fate:");
        System.out.println("1: Attaquer");
        System.out.println("2: Utiliser un objet");
        System.out.println("3: Attaque Spéciale");
        System.out.println("4: Fuir");

        Scanner scanner = new Scanner(System.in);
        int choix;
        int chance;

        while (true) {
            choix = scanner.nextInt();


            switch (choix) {
                case 1:

                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    chance = Randomiser.randomizer(1, 5);

                        if (chance > 2){
                            System.out.println("Vous avez fui le combat");
                            main();
                         }else {
                            System.out.println("Vous n'avez pas pu fuir le combat");
                         }

                            break;
                        }
        }


    }
}

