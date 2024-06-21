package difference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Difference {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());
        
        System.out.printf("DIFERENCA = %d\n", (a*b - c * d));
    }
}
