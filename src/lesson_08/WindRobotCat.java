package lab_08;

public class WindRobotCat extends RobotCat{
    @Override
    public String charge() {
        return super.charge() + "with wind";
    }
}
