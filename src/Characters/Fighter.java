package Characters;

import java.security.SecureRandom;

public class Fighter extends Characters{

    Fighter[] inventory = new Fighter[strength];


    SecureRandom random = new SecureRandom();

    @Override
    public int getStrength() {
        strength = random.nextInt(6,11);
        return strength;
    }

    @Override
    public int getVitality() {
        vitality = random.nextInt(3,8);
        return vitality;
    }

    @Override
    public int getIntelligence() {
        intelligence = random.nextInt(1,6);
        return intelligence;
    }
}
