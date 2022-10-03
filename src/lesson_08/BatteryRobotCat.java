package lab_08;

//Child class| Concrete class
public class BatteryRobotCat extends RobotCat {

    /*public BatteryRobotCat(String name, String productionDate) {
        super(name, productionDate);
    }*/

    //Re-implement the parent's method
    @Override
    public String charge() {
        return super.charge() + "with electric";
    }
}
