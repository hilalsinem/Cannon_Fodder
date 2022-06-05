package Items.Weapons;

import Items.Item;

public abstract class Weapon implements Item {
    protected String name;
    protected double weight;
    protected double value;

    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void setWeight(double weight){
        this.weight = weight;
    }
    @Override
    public double getWeight(){
        return this.weight;
    }

    @Override
    public void setValue(double value){
        this.value = value;
    }
    @Override
    public double getValue(){
        return this.value;
    }

    public abstract void specialAbility();
}
