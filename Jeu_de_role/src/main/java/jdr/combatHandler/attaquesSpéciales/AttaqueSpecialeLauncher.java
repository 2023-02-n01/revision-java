package jdr.combatHandler.attaquesSpéciales;
import jdr.combatHandler.attaque.CalculsAttaque;
import jdr.combatHandler.MenuCombat;

public class AttaqueSpecialeLauncher extends CalculsAttaqueSpe {
    int getAttMonstre;


    public void main() {

        jetDesAttSpe();
        CalculsAttaque getAttMonstre = new CalculsAttaque();
        getAttMonstre.getAttaqueMonstre();
        calculAttaqueSpe();

        MenuCombat loopmenu = new MenuCombat();
        loopmenu.debutCombat();



    }


}
