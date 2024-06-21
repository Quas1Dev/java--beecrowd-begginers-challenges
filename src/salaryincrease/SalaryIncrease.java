package salaryincrease;

import java.util.Scanner;

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        float salary = Float.parseFloat(k.nextLine());
        float newSalary;
        float readjustment;
        int percent;
        
        if (salary > 0 && salary <= 400.00f ) {
            newSalary = salary * 1.15f;
            readjustment = salary * 0.15f;
            percent = 15;
        } else if(salary > 400f && salary <= 800f){
            newSalary = salary * 1.12f;
            readjustment = salary * 0.12f;
            percent = 12;
        } else if(salary > 800f && salary <= 1200f){
            newSalary = salary * 1.1f;
            readjustment = salary * 0.1f;
            percent = 10;
        } else if(salary > 1200f && salary <= 2000f){
            newSalary = salary * 1.07f;
            readjustment = salary * 0.07f;
            percent = 7;
        } else {
            newSalary = salary * 1.04f;
            readjustment = salary * 0.04f;
            percent = 4;
        }
        
        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", readjustment);
        System.out.printf("Em percentual: %d %%\n", percent);
    }
}
