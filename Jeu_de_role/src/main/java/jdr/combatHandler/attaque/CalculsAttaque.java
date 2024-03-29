package jdr.combatHandler.attaque;

import jdr.combatHandler.Randomiser;
import jdr.entites.personnage.Personnage;
import jdr.entites.creatures.Monstre;
import jdr.entites.personnage.CreationPersonnage;

public class CalculsAttaque {

    public static int attaquePersonnage;
    protected Personnage personnage;
   // public int attaquePersonnage;

    public static Monstre monstre;
    public static int attaqueMonstre;
    int degats;




    public void getPlayerInfo() {
        personnage = CreationPersonnage.personnage;
        int random = Randomiser.randomizer(1, 10);
        System.out.println("+=============================================+");
        System.out.println("|(╯°□°)╯Force supplémentaire du héros = " + random);
        attaquePersonnage = personnage.getForce() + random;
        System.out.println("|Attaque du personnage :" + attaquePersonnage);

    }
    //"****************************************************************"

    public void getAttaqueMonstre() {

       /* if (monstre == null) {
            LancementCombat lancementCombat = new LancementCombat();
            monstre = lancementCombat.creationMonstre();
        }*/

        int random = Randomiser.randomizer(1, 10);
        System.out.println("+----------------------------------------------");
        System.out.println("| ʕง•ᴥ•ʔงForce supplémentaire du monstre = " + random);
        attaqueMonstre = monstre.getForce()+random;

        System.out.println("|Force du monstre :" + attaqueMonstre);
        System.out.println("+=============================================+");
        System.out.println(" ");

    }
    //*****************************************************************

    public void calculAttaque(){
        //Attaque personnage
        if (attaquePersonnage > attaqueMonstre){
            degats = attaquePersonnage - attaqueMonstre;
            monstre.setPointsDV(monstre.getPointsDV() - degats);
            //Print interactions victoire personnage
            System.out.println("+=====================================");
            if(degats > 10){
                System.out.println("| *******Coup critique!!!**********");
            }
            System.out.println("|"+personnage.nom + " inflige " +  degats + " dégats");
            System.out.println("|   (=O*_*)=O     ");
            System.out.println("|Pv restants du Monstre: " + monstre.getPointsDV());
            System.out.println("+=================================================================");
            System.out.println("|  Nom= " + personnage.getNom() + ", Force= " + personnage.getForce()+ ", PV= "+ personnage.getPointsDV() + ", Mana= "+ personnage.getMana()+", Score= "+personnage.getScore());
            System.out.println("|"+personnage.getNom() +"(=O*_*)=O     VS    Q(*_*Q) " +monstre.getNom());
            System.out.println("|  Nom= " + monstre.getNom() + ", Force= " + monstre.getForce()+ ", PV= "+ monstre.getPointsDV() + ", Score= "+personnage.getScore());
            System.out.println("+=================================================================");

            //Attaque Monstre
        } else if (attaquePersonnage < attaqueMonstre){
            degats = attaqueMonstre - attaquePersonnage;
            personnage.setPointsDV(personnage.getPointsDV() - degats);


            //Print interactions victoire monstre
            System.out.println("======================================");
            if(degats > 10){
                System.out.println("| *******Coup critique!!!**********");
            }
            System.out.println("| "+ monstre.getNom() + " inflige " +  degats + " dégats");
            System.out.println("|             Q(*_*Q)      ");
            System.out.println("| Pv restants du Personnage: " + personnage.getPointsDV());
            System.out.println("+=================================================================");
            System.out.println("|  Nom= " + personnage.getNom() + ", Force= " + personnage.getForce()+ ", PV= "+ personnage.getPointsDV() + ", Mana= "+ personnage.getMana()+", Score= "+personnage.getScore());
            System.out.println("| "+personnage.getNom() +" (=O*_*)=O    VS    Q(*_*Q) " +monstre.getNom());
            System.out.println("|  Nom= " + monstre.getNom() + ", Force= " + monstre.getForce()+ ", PV= "+ monstre.getPointsDV() + ", Score= "+personnage.getScore());
            System.out.println("+=================================================================");
        } else {

            //Print égalité
            System.out.println("|Vos attaques s'annulent");
            System.out.println("+=================================================================");
            System.out.println("|  Nom= " + personnage.getNom() + ", Force= " + personnage.getForce()+ ", PV= "+ personnage.getPointsDV() + ", Mana= "+ personnage.getMana()+", Score= "+personnage.getScore());
            System.out.println("| "+personnage.getNom() +" (=O*_*)=O    VS    Q(*_*Q) " +monstre.getNom());
            System.out.println("|  Nom= " + monstre.getNom() + ", Force= " + monstre.getForce()+ ", PV= "+ monstre.getPointsDV() + ", Score= "+personnage.getScore());
            System.out.println("+=================================================================");

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



