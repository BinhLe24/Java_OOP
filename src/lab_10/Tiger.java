package lab_10;

import java.security.SecureRandom;

public class Tiger extends Animal{
    static final int TIGER_MAX_SPEED = 150;
    int speed = new SecureRandom().nextInt(TIGER_MAX_SPEED);

    @Override
    public String getName() {
        return "Tiger";
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
