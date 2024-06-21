package challangeareaofacircle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaOfACircle {
    public static void main(String[] args) throws IOException{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        
        double r = Double.parseDouble(bf.readLine());
        double pi = 3.14159;
        double area = pi * (r * r);
        System.out.printf("A=%.4f\n", area);
 
    }
}
