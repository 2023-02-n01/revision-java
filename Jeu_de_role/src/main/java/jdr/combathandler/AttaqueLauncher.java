package jdr.combathandler;

public class AttaqueLauncher extends CalculsAttaque {


    public void main() {
        getPlayerInfo();
        getAttaqueMonstre();
        calculAttaque();
        MenuCombat loopmenu = new MenuCombat();
        loopmenu.debutCombat();


    }


}
