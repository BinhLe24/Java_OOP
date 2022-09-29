package lab_07;

public class SalaryCalculator {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        Contractor contractor = new Contractor();

        int totalFtes = 3;
        int totalContractors = 2;
        int TotalMonthSalary = totalFtes * fte.salary() + totalContractors * contractor.salary();
        System.out.println(TotalMonthSalary);
    }
}
