package lab_06;

import java.util.Scanner;

public class lab06_02_1 {
    public static void main(String[] args) {
        String myPassword = "password123";
        System.out.print("Please enter your password: ");

        int myCount = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            String s1 = scanner.next();
            if (s1.equals(myPassword)) {
                System.out.println("Successful login");
                break;
            } else {
                myCount = myCount + 1;
                if (myCount >= 3) {
                    System.out.println("Password is wrong 3 times. Please wait for 10 minutes");
                } else {
                    System.out.print("Please enter your password again: ");
                }
            }
        } while (myCount < 3);
    }
}
