package lab_10;

import java.security.SecureRandom;

public class Horse extends Animal{
    static final int HORSE_MAX_SPEED = 100;
    int speed = new SecureRandom().nextInt(HORSE_MAX_SPEED);

    @Override
    public String getName() {
        return "Horse";
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
