package taxes;

import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        float salary = k.nextFloat();
        float dueTaxes = 0;
        
        if (salary >= 0 && salary <= 2000) {
            System.out.println("Isento");
        } else if (salary > 2000f && salary <= 3000f) {
            salary = salary - 2000;
            dueTaxes = dueTaxes + (salary * 0.08f);
            System.out.printf("R$ %.2f\n", dueTaxes);
            
        } else if (salary > 3000f && salary <= 4500f) {
            
            salary = salary - 3000;
            dueTaxes = dueTaxes + (1000*0.08f) + (salary * 0.18f);
        
            System.out.printf("R$ %.2f\n", dueTaxes);
            
        } else if (salary > 4500f){
            salary = salary - 4500;
            dueTaxes = dueTaxes + (1000*0.08f) + (1500 * 0.18f) + salary * 0.28f;
            System.out.printf("R$ %.2f\n", dueTaxes);
        }
        
    }
}
