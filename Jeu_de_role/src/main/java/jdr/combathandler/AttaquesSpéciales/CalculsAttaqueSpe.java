package jdr.combathandler.AttaquesSpéciales;

import jdr.combathandler.CalculsAttaque;
import jdr.combathandler.Randomiser;
import jdr.entites.Objets.MenuObjets;
import jdr.entites.Personnage;
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


  public void jetDesAttSpe(){
        int choixattspe = Randomiser.randomizer(1,10);

        switch (choixattspe) {

            case 1,2,3,4,5,6,7,8:
                getPlayerInfoDD();
                break;

            case 9:
                getPlayerInfoDD();
                break;
            case 10:
                getPlayerInfoDD();
                break;


        }
    }
    public void getPlayerInfoDD() {

        int random = Randomiser.randomizer(1, 25);
        int randomfail = Randomiser.randomizer(-5, random);
        int chance;
        chance = Randomiser.randomizer(1,10);
        System.out.println("Déclenchement: Dés du Diable (Bonus d'attaque= (1-25) (40% de succès/ Peut être fatal en cas d'échec))");
        System.out.println("======================================");

        if (chance <=4) {
            System.out.println("Les dés vous accordent leur pouvoir, Lady Luck fera-t-elle de même?");
            System.out.println("Avantage des Dés du Diable: " + random);
            System.out.println("======================================");
            System.out.println("(╯°□°)╯Force supplémentaire du héros = " + random );


            //personnage = CreationPersonnage.personnage;
            attaquePersonnage = personnage.getForce() + random;
            System.out.println("Attaque endiablée :" + attaquePersonnage);
        } else {
            System.out.println("Les dés sont mal pipés, votre attaque aussi...");
            System.out.println("Pénalité dés du diable = Avantage:"+ random + " / pénalité: " + randomfail * 2 );
            //personnage = CreationPersonnage.personnage;
            attaquePersonnage = ((personnage.getForce() + random) - Math.abs (randomfail * 2));
            System.out.println("Attaque dés pipés :" + attaquePersonnage);
        }

    }

    public void calculAttDevilsDice(){


            getPlayerInfoDD();


        }




        public void calculAttRage(){

    }


    public void calculAttaqueSpe(){
//        personnage = CreationPersonnage.personnage;
//        attaquePersonnage = CalculsAttaque.attaquePersonnage;
//        monstre = CalculsAttaque.monstre;
        attaqueMonstre = CalculsAttaque.attaqueMonstre;
        //Attaque personnage
        if (attaquePersonnage > attaqueMonstre){
            degats = attaquePersonnage - attaqueMonstre;
            monstre.setPointsDV(monstre.getPointsDV() - degats);
            if(degats > 10){
                System.out.println("*******Coup critique!!!**********");
            }
            //Print interactions victoire personnage
            System.out.println("======================================");
            System.out.println(personnage.nom + " inflige " +  degats + " dégats");
            System.out.println("Pv restants du Monstre: " + monstre.getPointsDV());
            System.out.println("======================================");
            System.out.println("***"+personnage+"***");
            System.out.println(personnage.getNom() +" (=O*_*)=O    VS    Q(*_*Q) " +monstre.getNom());
            System.out.println("***"+monstre+"***");

            //Attaque Monstre
        } else if (attaquePersonnage < attaqueMonstre){
            degats = attaqueMonstre - attaquePersonnage;
            personnage.setPointsDV(personnage.getPointsDV() - degats);
            if(degats > 10){
                System.out.println("*******Coup critique!!!**********");
            }

            //Print interactions victoire monstre
            System.out.println("======================================");
            System.out.println(monstre.getNom() + " inflige " +  degats + " dégats");
            System.out.println("Pv restants du Personnage: " + personnage.getPointsDV());
            System.out.println("======================================");
            System.out.println("***"+personnage+"***");
            System.out.println(personnage.getNom() +" (=O*_*)=O    VS    Q(*_*Q) " +monstre.getNom());
            System.out.println("***"+monstre+"***");
        } else {

            //Print égalité
            System.out.println("Vos attaques s'annulent");
            System.out.println("======================================");
            System.out.println("***"+personnage+"***");
            System.out.println(personnage.getNom() +" (=O*_*)=O    VS    Q(*_*Q) " +monstre.getNom());
            System.out.println("***"+monstre+"***");

        }

    }
}
