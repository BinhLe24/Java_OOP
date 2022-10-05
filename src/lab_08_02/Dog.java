package lab_08_02;

import java.security.SecureRandom;

public class Dog extends Animal{

    static final int DOG_MAX_SPEED = 50;
    public Dog(String name){
        super(name, new SecureRandom().nextInt(DOG_MAX_SPEED));
    }
}
