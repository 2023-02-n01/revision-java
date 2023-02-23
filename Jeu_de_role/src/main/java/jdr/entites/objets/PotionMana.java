package jdr.entites.objets;

import jdr.combatHandler.Menus.MenuCombat;
import jdr.entites.personnage.CreationPersonnage;
import jdr.entites.personnage.Personnage;
import jdr.entites.shopHandler.Shop;

public class PotionMana {

    String nom;
    Integer pointsMana;

    Integer nombre;
    Integer gils;

    public PotionMana(String nom, Integer pointsMana, Integer nombre, Integer gils) {
        this.nom = nom;
        this.pointsMana = pointsMana;
        this.nombre = nombre;
        this.gils = gils;
    }

    public void tomeMethod(Personnage personnage) {
        MenuCombat lancementCombat = new MenuCombat();
        if (nombre > 0) {
            personnage.setMana(personnage.getMana() + pointsMana);
            nombre--;
            System.out.println("Vous avez récupéré: "+ pointsMana +  " points de Mana!");
            System.out.println(nom + " restantes: " + nombre);
            if (MenuObjets.tomeMineur != null){
                MenuObjets.tomeMineur.setNombre(nombre);
            } else if (MenuObjets.medkit != null) {
                MenuObjets.tomeMajeur.setNombre(nombre);

            }
            lancementCombat.debutCombat();
        }else{
            System.out.println("Vous n'avez plus de " + nom +"!");
            System.out.println(nom + " restantes " + nombre);
            lancementCombat.debutCombat();
        }
    }


    public void acheterMana(PotionMana potionMana) {
        Shop shop = new Shop();

        if (potionMana == MenuObjets.tomeMineur && CreationPersonnage.personnage.getGils() >= MenuObjets.tomeMineur.getGils()) {
            MenuObjets.tomeMineur.setNombre(MenuObjets.tomeMineur.getNombre() + 1);
            CreationPersonnage.personnage.setGils(CreationPersonnage.personnage.getGils() - MenuObjets.tomeMineur.getGils());
            System.out.println(MenuObjets.tomeMineur.getGils() +" G payés " + CreationPersonnage.personnage.getGils() + " G Restants" );

        } else if (potionMana == MenuObjets.tomeMajeur && MenuObjets.tomeMajeur !=null &&CreationPersonnage.personnage.getGils() >= MenuObjets.tomeMajeur.getGils()) {
            MenuObjets.tomeMajeur.setNombre(MenuObjets.tomeMajeur.getNombre() + 1);
            CreationPersonnage.personnage.setGils(CreationPersonnage.personnage.getGils() - MenuObjets.tomeMajeur.getGils());
            System.out.println(MenuObjets.tomeMajeur.getGils() +" G payés " + CreationPersonnage.personnage.getGils() + " G Restants" );
        }else {
            System.out.println("Vous n'avez pas assez de Gils!");
            System.out.println(" ");
            shop.optionsShop();
        }
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPointsMana() {
        return pointsMana;
    }

    public void setPointsMana(Integer pointsMana) {
        this.pointsMana = pointsMana;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public Integer getGils() {
        return gils;
    }

    public void setGils(Integer gils) {
        this.gils = gils;
    }
}
