package jdr.combathandler.AttaquesSpéciales;
import jdr.combathandler.Attaque.CalculsAttaque;
import jdr.combathandler.Attaque.MenuCombat;

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
