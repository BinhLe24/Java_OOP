package lab_08_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public int totalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
                totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee fte = new FTE();
        Employee contractor = new Contractor();
        List<Employee> myArrayList = new ArrayList<>();

        System.out.print("Please enter number of full time employee: ");
        Scanner scanner = new Scanner(System.in);
        int fteNumber = scanner.nextInt();
        for (int i = 0; i < fteNumber; i++) {
            myArrayList.add(fte);
        }
        System.out.print("Please enter number of contractor: ");
        Scanner scanner1 = new Scanner(System.in);
        int contractorNumber = scanner1.nextInt();
        for (int i = 0; i < contractorNumber ; i++) {
            myArrayList.add(contractor);
        }

        EmployeeController employeeController = new EmployeeController();
        int totalSalary = employeeController.totalSalary(myArrayList);
        System.out.println("Total salary is " + totalSalary);
    }
}
