package jdr.combathandler;

import jdr.entites.creatures.CreationCreatures;

import java.util.Scanner;
import jdr.combathandler.Attaque;
import jdr.entites.creatures.Monstre;

public class LancementCombat extends Attaque {

    Monstre mon;
    public int numero = 0;

    public void main() {

    }


    public void creationMonstre() {
        int choixmonstre = Randomiser.randomizer(1, 3);

        //return monstre;


        if (monstre == null || monstre.getPointsDV() <= 0) {
            switch (choixmonstre) {

                case 1:
                    numero = 1;
                    mon = CreationCreatures.creationLoup();
                    break;
                case 2:
                    numero = 2;
                    mon = CreationCreatures.creationGobelin();
                    break;
                case 3:
                    numero = 3;
                    mon = CreationCreatures.creationTroll();
                    break;


            }
            monstre = mon;
        } else {
            debutCombat();

        }

    }

        public void debutCombat () {
            System.out.println("Choose your fate:");
            System.out.println("1: Attaquer");
            System.out.println("2: Utiliser un objet");
            System.out.println("3: Attaque Spéciale");
            System.out.println("4: Fuir");

            Scanner scanner = new Scanner(System.in);
            int choix;
            int chance;
            if (monstre == null){
                creationMonstre();

            while (monstre.getPointsDV() > 0) {
                choix = scanner.nextInt();

                Attaque attaque = new Attaque();
                switch (choix) {
                    case 1:
                        attaque.main();
                        break;

                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        chance = Randomiser.randomizer(1, 5);

                        if (chance > 2) {
                            System.out.println("Vous avez fui le combat");
                            main();
                        } else {
                            System.out.println("Vous n'avez pas pu fuir le combat");
                        }

                        break;
                    }
                }

            }
        }

}

