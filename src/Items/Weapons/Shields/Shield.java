package Items.Weapons.Shields;

import Items.Weapons.Weapon;

public class Shield extends Weapon {

    public Shield(String name, double weight, double value){
        this.name = name;
        this.weight = weight;
        this.value = value;
    }

    public Shield(){

    }

    public void specialAbility(){
        System.out.println("\nThis method should block an attack for any kind of shield!");
    }
}
