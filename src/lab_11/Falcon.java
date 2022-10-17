package lab_11;

import java.security.SecureRandom;

public class Falcon implements FlyMoveAble{

    private int speed;
    private boolean flyAble;
    static final int FALCON_MAX_SPEED = 110;
    public Falcon() {
        this.speed = new SecureRandom().nextInt(FALCON_MAX_SPEED);
        this.flyAble = true;
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
