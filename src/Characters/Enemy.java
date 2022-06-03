package Characters;

import java.security.SecureRandom;

public class Enemy extends Characters {

    SecureRandom random = new SecureRandom();

    @Override
    public int getStrength(){
        strength = random.nextInt(1,6);
        return strength;
    }

    @Override
    public int getVitality() {
        vitality = random.nextInt(1,6);
        return vitality;
    }

    @Override
    public int getIntelligence() {
       intelligence =random.nextInt(1,6);
       return intelligence;
    }
}
