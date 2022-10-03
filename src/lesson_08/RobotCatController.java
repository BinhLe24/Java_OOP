package lab_08;

import java.util.Arrays;
import java.util.List;

public class RobotCatController {
    public void chargeRobots(List<RobotCat> robotCatList){
        for (RobotCat robotCat : robotCatList) {
            System.out.println(robotCat.charge());
        }
    }

    public static void main(String[] args) {
        // Model | Controllers | Data (Objects)
        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();
        RobotCat windRobotCat = new WindRobotCat();
        List<RobotCat> robotCatList = Arrays.asList(batteryRobotCat, solarRobotCat, windRobotCat);

        RobotCatController robotCatController = new RobotCatController();
        robotCatController.chargeRobots((robotCatList));
    }
}
