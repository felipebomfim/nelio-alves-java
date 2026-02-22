package estrutura_sequencial_exercicios.src.main;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeNumber;
        int numberOfHoursWorked;
        double salaryPerHour, totalSalary;
        employeeNumber = sc.nextInt();
        numberOfHoursWorked = sc.nextInt();
        salaryPerHour = sc.nextDouble();
        
        totalSalary = salaryPerHour*numberOfHoursWorked;

        System.out.println("NUMBER = "+employeeNumber);
        System.out.printf("SALARY = U$ %.2f\n", totalSalary);


        sc.close();
    }
}
