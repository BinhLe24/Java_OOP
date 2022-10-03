package lab_08;

public class SolarRobotCat extends RobotCat {
    @Override
    public String charge() {
        return super.charge() + "with solar energy";
    }
}

