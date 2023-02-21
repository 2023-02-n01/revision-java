package jdr.combathandler.Attaque;

import jdr.combathandler.Attaque.CalculsAttaque;
import jdr.combathandler.Attaque.MenuCombat;

public class AttaqueLauncher extends CalculsAttaque {


    public void main() {
        getPlayerInfo();
        getAttaqueMonstre();
        calculAttaque();
        MenuCombat loopmenu = new MenuCombat();
        loopmenu.debutCombat();


    }


}
