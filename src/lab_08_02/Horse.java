package lab_08_02;

import java.security.SecureRandom;

public class Horse extends Animal{
    @Override
    public String getName() {
        return "Horse";
    }
    @Override
    public int getSpeed() {
        int randomSpeed = new SecureRandom().nextInt(75);
        return randomSpeed;
    }
}
