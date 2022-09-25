package lab_06;

import java.util.HashMap;
import java.util.Map;

public class lab06_01 {
    public static void main(String[] args) {
        String s1 = "2hrs and 5 minutes";
        System.out.println(s1);
        int iTextHour = s1.indexOf("hrs");
        int iTextMinutes = s1.indexOf("minutes");

        String myHourStr = s1.substring(0, iTextHour);
        int myHour = Integer.parseInt(myHourStr);
        String s2 = s1.substring(iTextHour, iTextMinutes);
        String myMinutesStr = s2.replaceAll("[^0-9]","");
        int myMinutes = Integer.parseInt(myMinutesStr);

        int Total = myHour * 60 + myMinutes;
        System.out.println("--> Total is " + Total + " minutes");

    }
}
