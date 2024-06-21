package salary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salary {
    public static void main(String[] args) throws IOException{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        
        int number = Integer.parseInt(bf.readLine());
        int workedHours = Integer.parseInt(bf.readLine());
        float amountReceived = Float.parseFloat(bf.readLine());
        
        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f\n", (amountReceived * workedHours) );
    }
}
