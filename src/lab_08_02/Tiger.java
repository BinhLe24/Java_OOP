package lab_08_02;

import java.security.SecureRandom;

public class Tiger extends Animal {
    static final int TIGER_MAX_SPEED = 150;

    public Tiger(String name) {
        super(name, new SecureRandom().nextInt(TIGER_MAX_SPEED));
    }
}
