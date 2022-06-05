package Items.Weapons.Wands;

import Items.Weapons.Weapon;

public class Wand extends Weapon {

    public Wand(String name, double weight, double value){
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public Wand(){

    }

    public void specialAbility(){
        System.out.println("\nThis method should heal a player for any kind of wand!");
    }
}
