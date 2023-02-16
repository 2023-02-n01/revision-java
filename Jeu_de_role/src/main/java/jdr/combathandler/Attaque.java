package jdr.combathandler;

public class Attaque extends CalculsAttaque {


    public void main() {
        getPlayerInfo();
        getAttaqueMonstre();
        calculAttaque();
        MenuCombat loopmenu = new MenuCombat();
        loopmenu.debutCombat();


    }


}
