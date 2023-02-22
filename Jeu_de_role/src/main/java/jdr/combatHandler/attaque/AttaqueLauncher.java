package jdr.combatHandler.attaque;

import jdr.combatHandler.MenuCombat;

public class AttaqueLauncher extends CalculsAttaque {


    public void main() {
        getPlayerInfo();
        getAttaqueMonstre();
        calculAttaque();
        MenuCombat loopmenu = new MenuCombat();
        loopmenu.debutCombat();


    }


}
