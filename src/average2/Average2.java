package average2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average2 {
    public static void main(String[] args) throws IOException{
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        
        float f1 = Float.parseFloat(bf.readLine());
        float f2 = Float.parseFloat(bf.readLine());
        float f3 = Float.parseFloat(bf.readLine());
        
        float average= (f1 * 2 + f2 * 3 + f3 * 5) / 10;
        
        System.out.printf("MEDIA = %.1f\n", average);
    }
}
