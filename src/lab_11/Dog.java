package lab_11;

import java.security.SecureRandom;
import java.util.RandomAccess;

public class Dog implements FlyMoveAble{
    private int speed;
    private boolean flyAble;
    static final int DOG_MAX_SPEED = 50;
    public Dog() {
        this.speed = new SecureRandom().nextInt(DOG_MAX_SPEED);
        this.flyAble = false;
    }
//    public Dog(int speed, boolean flyAble) {
//        this.speed = new SecureRandom().nextInt(speed);
//        this.flyAble = flyAble;
//    }

    @Override
    public int speed() {
      return this.speed;
    }

    @Override
    public boolean flyAble() {
        return this.flyAble;
    }
}
