package lab_11;

import java.security.SecureRandom;

public class Horse implements FlyMoveAble{
    private int speed;
    private boolean flyAble;
    static final int HORSE_MAX_SPEED = 70;
    public Horse() {
        this.speed = new SecureRandom().nextInt(HORSE_MAX_SPEED);
        this.flyAble = false;
    }

    @Override
    public int speed() {
        return this.speed;
    }

    @Override
    public boolean flyAble() {
        return this.flyAble;
    }
}
