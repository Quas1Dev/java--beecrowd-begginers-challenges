package simpleproduct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleProduct {

    public static void main(String[] args) throws IOException{

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);

        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        
        System.out.printf("PROD = %d\n", (n1 * n2));
    }
}
