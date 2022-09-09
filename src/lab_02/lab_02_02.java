package lab_02;

import java.util.Scanner;

public class lab_02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        long myNumber = scanner.nextLong();

        int soDu = (int) myNumber%2;
        if (myNumber==0){
            System.out.println("It is neither an even number nor odd number");
        } else if(soDu == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("--> It is an odd number");
        }
    }
}
