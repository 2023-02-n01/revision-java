package jdr.combathandler;

import jdr.entites.Personnage;
import jdr.entites.creatures.Monstre;
import jdr.entites.personnage.CreationPersonnage;

public class CalculsAttaque {

    public static int attaquePersonnage;
    Personnage personnage;
   // public int attaquePersonnage;

    public static Monstre monstre;
    public static int attaqueMonstre;
    int degats;




    public void getPlayerInfo() {
        personnage = CreationPersonnage.personnage;
        int random = Randomiser.randomizer(1, 10);
        System.out.println("======================================");
        System.out.println("(╯°□°)╯Force supplémentaire du héros = " + random);
        attaquePersonnage = personnage.getForce() + random;
        System.out.println("Attaque du personnage :" + attaquePersonnage);
    }
    //"****************************************************************"

    public void getAttaqueMonstre() {

       /* if (monstre == null) {
            LancementCombat lancementCombat = new LancementCombat();
            monstre = lancementCombat.creationMonstre();
        }*/

        int random = Randomiser.randomizer(1, 10);
        System.out.println("======================================");
        System.out.println("ʕง•ᴥ•ʔงForce supplémentaire du monstre = " + random);
        attaqueMonstre = monstre.getForce()+random;

        System.out.println("Force du monstre :" + attaqueMonstre);

    }
    //*****************************************************************

    public void calculAttaque(){
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

//Exemple calcul raté
     /*if (lancementCombat.numero == 1 ) {
            Loup loup = CreationCreatures.creationLoup();
            forceMonstre = loup.getForce();
            pvMonstre = loup.getPointsDV();
            random = Randomiser.randomizer(1, 10);
            forceMonstre = forceMonstre + random;
            System.out.println("Force du monstre :" + forceMonstre);
            return forceMonstre;

        } else if (lancementCombat.numero == 2) {
            Gobelin gobelin = CreationCreatures.creationGobelin();
            forceMonstre = gobelin.getForce();
            pvMonstre = gobelin.getPointsDV();
            random = Randomiser.randomizer(1, 10);
            forceMonstre = forceMonstre + random;
            System.out.println("Force du monstre :" + forceMonstre);
            return forceMonstre;

        } else {
            forceMonstre = CreationCreatures.creationTroll().getForce();
            pvMonstre = CreationCreatures.creationTroll().getPointsDV();
            random = Randomiser.randomizer(1, 10);
            forceMonstre = forceMonstre + random;
            System.out.println("Force du monstre :" + forceMonstre);
            return forceMonstre;

        }*/



