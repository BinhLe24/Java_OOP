package lab_02;

import java.util.Scanner;

public class lab_02_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight(kg):");
        float clientWeight = scanner.nextFloat();
        System.out.print("Please enter your height(m):");
        float clientHeight = scanner.nextFloat();

        float BMI = clientWeight / (clientHeight * 2);
        System.out.println("BMI = " + BMI);
        if (BMI < 18.5){
            System.out.println("Underweight");
            float mySuggest = (float) ((18.5 * clientHeight * 2) - clientWeight);
            System.out.println("--> You should increase: " + mySuggest + "kg");
        } else if (BMI <= 24.9) {
            System.out.println("Normal weight");
        } else if (BMI <= 29.9) {
            System.out.println("Overweight");
            float mySuggest = (float)(clientWeight - (24.9 * clientHeight * 2));
            System.out.println("--> You should decrease: " + mySuggest + "kg");
        } else {
            System.out.println("Obesity");
            float mySuggest = (float)(clientWeight - (24.9 * clientHeight * 2));
            System.out.println("--> You should decrease: " + mySuggest + "kg");
        }
    }
}
