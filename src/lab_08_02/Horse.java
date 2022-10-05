package lab_08_02;

import java.security.SecureRandom;

public class Horse extends Animal{
    static final int HORSE_MAX_SPEED = 70;
    public Horse(String name){
        super(name, new SecureRandom().nextInt(HORSE_MAX_SPEED));
    }
}
