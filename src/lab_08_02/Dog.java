package lab_08_02;

import java.security.SecureRandom;

public class Dog extends Animal{
    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(60);
        return randomSpeed;
    }
}
