package lab_06;

import java.util.Scanner;

public class lab06_02_2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        System.out.print("Please enter your password: ");

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            String s1 = scanner.next();
            if (s1.equals(myPassword)){
                System.out.println("Successful login");
                break;
            } else {
                if (i == 2){
                    System.out.println("Password is wrong 3 times. Please wait for 10 minutes");
                } else {
                    System.out.print("Please enter your password again: ");
                }
            }
        }
    }
}
