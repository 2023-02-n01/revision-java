package jdr.combatHandler.attaquesSpéciales;

import jdr.combatHandler.attaque.CalculsAttaque;
import jdr.combatHandler.MenuCombat;
import jdr.combatHandler.Randomiser;
import jdr.entites.personnage.Personnage;
import jdr.entites.creatures.Monstre;
import jdr.entites.personnage.CreationPersonnage;

public class CalculsAttaqueSpe extends CalculsAttaque {
    Personnage personnage = CreationPersonnage.personnage;
    int attaquePersonnage = CalculsAttaque.attaquePersonnage;
    int attaqueMonstre = CalculsAttaque.attaqueMonstre;
    int degats;


    Monstre monstre = CalculsAttaque.monstre;


    public void main() {


    }


    public void jetDesAttSpe() {
        int choixattspe = Randomiser.randomizer(1, 10);
        if (personnage.getMana() >= 10) {
            personnage.setMana(personnage.getMana() - 10);
            switch (choixattspe) {

                case 1, 2, 3, 4, 5, 6, 7, 8:
                    getPlayerInfoDD();
                    break;

                case 9:
                    getPlayerInfoRage();
                    break;
                case 10:
                    getPlayerInfoEchec();
                    break;


            }
        }else{
            System.out.println("Vous n'avez pas assez de mana  Mana restant:" + personnage.getMana());
            MenuCombat menuCombat = new MenuCombat();
            menuCombat.debutCombat();
        }
    }

    public void getPlayerInfoDD() {

        int random = Randomiser.randomizer(1, 25);
        int randomfail = Randomiser.randomizer(-5, random);
        int chance;
        chance = Randomiser.randomizer(1, 10);
        System.out.println("Déclenchement: [Dés du Diable] ⚀⚅(Bonus d'attaque= (1-25) (70% de succès/ Peut être fatal en cas d'échec))");
        System.out.println("Mana restant :" + personnage.getMana());
        System.out.println("");

        if (chance <= 7) {
            System.out.println("[Succès!] Les dés vous accordent leur pouvoir, Lady Luck fera-t-elle de même?");
            System.out.println("Avantage des Dés du Diable: " + random);
            System.out.println("======================================");
            System.out.println("(╯°□°)╯Force supplémentaire du héros = " + random);


            //personnage = CreationPersonnage.personnage;
            attaquePersonnage = personnage.getForce() + random;
            System.out.println("Attaque endiablée :" + attaquePersonnage);
        } else {
            System.out.println("[Echec...] Les dés sont mal pipés, votre attaque aussi...");
            System.out.println("Pénalité dés du diable = Avantage:" + random + " / pénalité: " + randomfail * 2);
            System.out.println("======================================");
            attaquePersonnage = ((personnage.getForce() + random) - Math.abs(randomfail * 2));
            System.out.println("(╯°□°)╯Force finale du héros = " + attaquePersonnage);
            System.out.println("Attaque dés pipés :" + attaquePersonnage);
        }

    }

    public void getPlayerInfoRage() {
        int random1;
        random1 = Randomiser.randomizer(10, 50);
        System.out.println("Déclenchement: [Rage] ୧༼ಠ益ಠ༽୨ (Force totale (10-50))");
        System.out.println("Mana restant :" + personnage.getMana());
        System.out.println("");
        if (random1 < 20) {
            System.out.println("Vous vous énervez légèrement et Frappez un peu plus fort que d'habitude ");
            System.out.println("(҂◡_◡) ᕤ Force du héros = " + random1);
        } else if (random1 < 30) {
            System.out.println("Le comportement du " + monstre.getNom() + "vous agaçe particulièrement et vous frappez bien plus fort que d'habitude");
            System.out.println("ᕙ(`▽´)ᕗ Force du héros = " + random1);
        } else if (random1 < 40) {
            System.out.println("Une rage inhabituelle vous habite et vous frappez votre ennemi comme s'il était votre bully au lycée");
            System.out.println("(•`_´•) Force du héros = " + random1);
        } else {
            System.out.println("La rage qui vous habite est telle que le monstre devant vous tente de prendre la fuite, vous le rattrapez et le tuez d'un seul coup");
            System.out.println("(◣_◢) Force du héros = " + random1);
        }
        attaquePersonnage = random1;
    }

    public void getPlayerInfoEchec() {
        int random2;
        random2 = Randomiser.randomizer(1, 5);

        if (random2 >= 4) {
            System.out.println("[Echec Critique] Vous préparez une attaque... puis votre pied glisse et vous vous effondrez sur la garde de votre épée. -2 PV/ 0 défense");
            System.out.println("Mana restant :" + personnage.getMana());
            attaquePersonnage = 0;
            personnage.setPointsDV(personnage.getPointsDV() - 2);
            System.out.println("(ㅠ﹏ㅠ) Force du héros = 0");
        } else {
            System.out.println("[Echec...] Vous manquez votre attaque... de loin.");
            System.out.println("Mana restant :" + personnage.getMana());
            System.out.println("(◡︵◡) Force du héros = " + personnage.getForce());
            attaquePersonnage = personnage.getForce();
        }
    }



    public void calculAttaqueSpe() {
        //        personnage = CreationPersonnage.personnage;
        //        attaquePersonnage = CalculsAttaque.attaquePersonnage;
        //        monstre = CalculsAttaque.monstre;
        attaqueMonstre = CalculsAttaque.attaqueMonstre;
        //Attaque personnage
        if (attaquePersonnage > attaqueMonstre) {
            degats = attaquePersonnage - attaqueMonstre;
            monstre.setPointsDV(monstre.getPointsDV() - degats);

            //Print interactions victoire personnage
            System.out.println("======================================");
            if (degats > 10) {
                System.out.println("*******Coup critique!!!**********");
            }
            System.out.println(personnage.nom + " inflige " + degats + " dégats");
            System.out.println("Pv restants du Monstre: " + monstre.getPointsDV());
            System.out.println("======================================");
            System.out.println("***" + personnage + "***");
            System.out.println(personnage.getNom() + " (=O*_*)=O    VS    Q(*_*Q) " + monstre.getNom());
            System.out.println("***" + monstre + "***");

            //Attaque Monstre
        } else if (attaquePersonnage < attaqueMonstre) {
            degats = attaqueMonstre - attaquePersonnage;
            personnage.setPointsDV(personnage.getPointsDV() - degats);


            //Print interactions victoire monstre
            System.out.println("======================================");
            if (degats > 10) {
                System.out.println("*******Coup critique!!!**********");
            }
            System.out.println(monstre.getNom() + " inflige " + degats + " dégats");
            System.out.println("Pv restants du Personnage: " + personnage.getPointsDV());
            System.out.println("======================================");
            System.out.println("***" + personnage + "***");
            System.out.println(personnage.getNom() + " (=O*_*)=O    VS    Q(*_*Q) " + monstre.getNom());
            System.out.println("***" + monstre + "***");
        } else {

            //Print égalité
            System.out.println("Vos attaques s'annulent");
            System.out.println("======================================");
            System.out.println("***" + personnage + "***");
            System.out.println(personnage.getNom() + " (=O*_*)=O    VS    Q(*_*Q) " + monstre.getNom());
            System.out.println("***" + monstre + "***");

        }

    }

}