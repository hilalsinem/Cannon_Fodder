package Items.Weapons.Swords;

import Items.Weapons.Weapon;

public class Sword extends Weapon {

    public Sword(String name, double weight, double value){
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public Sword(){

    }

    public void specialAbility(){
        System.out.println("\nThis method should protect user and make him/her unable to attack for any kind of sword!");
    }
}
