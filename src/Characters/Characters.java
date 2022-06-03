package Characters;

public abstract class Characters {

    protected int strength;
    protected int vitality;
    protected int intelligence;

    public abstract int getStrength();

    public void setStrength(int strength) {
        this.strength =strength;
    }

    public abstract int getVitality();

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public abstract int getIntelligence();

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public double HPPoint(){
        double HP =0.7*vitality+0.2*strength+0.1*intelligence;
        double result = Math.round(HP);
        return result;
    }
}
