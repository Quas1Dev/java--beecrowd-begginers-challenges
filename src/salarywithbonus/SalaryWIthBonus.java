
package salarywithbonus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalaryWIthBonus {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        
        String name = bf.readLine();
        float salary = Float.parseFloat((bf.readLine()));
        float salesTotal = Float.parseFloat(bf.readLine());
        
        System.out.printf("TOTAL = R$ %.2f\n", (salary + (salesTotal * 0.15)));
        
    }
}
