package jdr.combathandler;

import jdr.MenuPrincipal;
import jdr.combathandler.LancementCombat;

public class Attaque extends CalculsAttaque {


    public void main() {
        getPlayerInfo();
        getAttaqueMonstre();
        calculAttaque();
        LancementCombat loopmenu = new LancementCombat();
        loopmenu.debutCombat();


    }


}
