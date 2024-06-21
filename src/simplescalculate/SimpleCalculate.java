package simplescalculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCalculate {
    public static void main(String[] args) throws IOException{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        
        String[] product1 = bf.readLine().split(" ");
        String[] product2 = bf.readLine().split(" ");
        float[] dataP1 = new float[product1.length];
        float[] dataP2 = new float[product1.length];
        
        for (int i = 0; i < product1.length; i++) {
            dataP1[i] = Float.parseFloat(product1[i]);
            dataP2[i] = Float.parseFloat(product2[i]);
        }
        
        float tot = (dataP1[1] * dataP1[2]) + (dataP2[1] * dataP2[2]);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", tot);
    }
}
