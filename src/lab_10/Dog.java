package lab_10;

import java.security.SecureRandom;

public class Dog extends Animal {
    static final int DOG_MAX_SPEED = 50;
    int speed = new SecureRandom().nextInt(DOG_MAX_SPEED);
    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public int getSpeed() {
        return speed;
    }

}
