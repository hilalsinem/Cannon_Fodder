package Characters;

import java.security.SecureRandom;

public class Tank extends Characters{
    protected int inventory= strength;
    SecureRandom random = new SecureRandom();

    @Override
    public int getStrength() {
        strength = random.nextInt(1,6);
        return strength;
    }

    @Override
    public int getVitality() {
        vitality = random.nextInt(6,11);
        return vitality;
    }

    @Override
    public int getIntelligence() {
        intelligence = random.nextInt(3,8);
        return intelligence;
    }
}
