package Items.Clothings;

import Items.Item;

public class Clothing implements Item {

    private String name;
    private double value;
    private double weight;
    private int a;


    public Clothing(String name, double value, double weight,int a) {
        this.name = "UNK";
        this.a=0;
        this.weight=0.0;
        this.value=0.0;
    }

    public Clothing(){}

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setValue(double value){
        this.value = value;
    }
    public double getValue(){
        return value;
    }

    public void setWeight(double Weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public void protection(){
        getHealth()+=a;
    }

    public int getHealth() {
        int health = 0;
        return health;
    }


}
