package jdr.combathandler;

import jdr.entites.Personnage;
import jdr.entites.creatures.CreationCreatures;
import jdr.entites.personnage.CreationPersonnage;

import static jdr.combathandler.LancementCombat.creationMonstre;

public class Attaque {
    public static void main(String[] args) {

    }

    int forcePersonnage;
    int random;
    int forceMonstre;

    private void getPlayerInfo(){

       forcePersonnage = CreationPersonnage.personnage.getForce();
       random = Randomiser.randomizer(1,10);
       forcePersonnage = forcePersonnage + random;

    }

    private int getMonsterInfo(){

        if (CreationCreatures.){
            forceMonstre = CreationCreatures.creationLoup().getForce();
        random = Randomiser.randomizer(1,10);
            forceMonstre = forceMonstre + random;
            return forceMonstre;
        }else if(creationMonstre() == 2){

        }


    }

    }



