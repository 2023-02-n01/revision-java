package jdr.combatHandler;

import jdr.MenuPrincipal;
import jdr.combatHandler.attaque.AttaqueLauncher;
import jdr.combatHandler.attaquesSpéciales.AttaqueSpecialeLauncher;
import jdr.entites.objets.MenuObjets;
import jdr.entites.creatures.CreationCreatures;

import java.util.Scanner;

import jdr.entites.creatures.Monstre;
import jdr.entites.personnage.CreationPersonnage;

public class MenuCombat extends AttaqueLauncher {

    Monstre mon;
    public int numero = 0;
    public static int monstresBattus = 0;

    public void main() {

    }

//Méthode de création de monstre grâce au Randomizer
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
                default:
                    System.out.println("! Choix invalide, veuillez réessayer !");
                    System.out.println("======================================");
                    creationMonstre();
                    break;

            }
            monstre = mon;
        } else {
            debutCombat();

        }

    }

        public void debutCombat () {

            personnage = CreationPersonnage.personnage;
            //Methodes Victoire/Défaite
//Partie méthode de confirmation victoire/défaite après combat
            if (monstre == null) {
                System.out.println("======================================");
                creationMonstre();
                System.out.println(" ");
            }if (monstre != null) {
                if (monstre.getPointsDV() <= 0) {
                    personnage.setScore(personnage.getScore() + monstre.getScore());
                    personnage.setGils(personnage.getGils() + monstre.getGils());
                    System.out.println("*****Vous avez gagné le combat!!****");
                    System.out.println("Score du joueur: " + personnage.getScore());
                    System.out.println("***************V(-.o)V**************");
                    monstresBattus = monstresBattus + 1;
                    monstre = null;
                    MenuContinuerFin.rencontreShop();
                }
                if (personnage.getPointsDV() <= 0) {
                    System.out.println("*****Vous avez perdu et êtes mort dans d'atroces souffrances...*****");
                    System.out.println("Votre score final est de : " + personnage.getScore());
                    System.out.println("*********************༼ つ ಥ_ಥ ༽つ******************");
                    System.out.println("Monstres battus : " + monstresBattus);
                    personnage = null;
                    MenuPrincipal.choixMenu();
                }

            }

            //Print du menu de combat
            System.out.println("======================================");
            System.out.println("Choose your fate:");
            System.out.println("1: Attaquer");
            System.out.println("2: Utiliser un objet");
            System.out.println("3: Attaque Spéciale(random ↓)");
            System.out.println("     [Dés du diable]:(Probabilité: 80% / Réussite: 40%)");
            System.out.println("     [Rage]:(Probabilité: 10% / Réussite: 100% )");
            System.out.println("     [Echec]:(Probabilité: 10%)");
            System.out.println("4: Fuir");
            System.out.println("======================================");

            Scanner scanner = new Scanner(System.in);
            int choix;
            int chance;
            if (monstre == null){
                creationMonstre();}

            while (monstre.getPointsDV() > 0 && personnage.getPointsDV() > 0) {
                choix = scanner.nextInt();
                //Sélection des options du menu de combat
                AttaqueLauncher attaqueLauncher = new AttaqueLauncher();
                AttaqueSpecialeLauncher attaqueSpecialeLauncher = new AttaqueSpecialeLauncher();
                MenuObjets menuObjets = new MenuObjets();
                switch (choix) {
                    case 1:
                        attaqueLauncher.main();
                        break;

                    case 2:
                        menuObjets.main(personnage);
                        break;
                    case 3:
                        //Ajouter attaque speciale "dés du diable" degats random entre 1 et 50
                        attaqueSpecialeLauncher.main();
                        break;
                    case 4:
                        chance = Randomiser.randomizer(1, 5);
                        //Méthode "chances de fuite"
                        if (chance > 2) {
                            System.out.println("*****Vous avez fui le combat*****");
                            monstre = null;
                            MenuContinuerFin.continueMenu();
                        } else {
                            System.out.println("*****Vous n'avez pas pu fuir le combat*****");
                            System.out.println(monstre.getNom() + " Vous attaque pour " + monstre.getForce()+" dégats!");
                            System.out.println("Pv restants: ");
                            personnage.setPointsDV(personnage.getPointsDV() - monstre.getForce());


                            if(personnage.getPointsDV() <= 0){
                                System.out.println("Vous êtes mort en fuyant le combat... Triste.");
                                System.out.println("Votre score final est de : " + personnage.getScore());
                                System.out.println("Monstres battus :" + monstresBattus);
                                personnage = null;
                                MenuPrincipal.choixMenu();
                            }
                            System.out.println(personnage.getPointsDV());
                            debutCombat();
                        }

                        break;
                    default:
                        System.out.println("! Choix invalide, veuillez réessayer !");
                        System.out.println("======================================");

                        debutCombat();
                        
                }
            }
        }
}



