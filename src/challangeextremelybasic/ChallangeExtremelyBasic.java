package challangeextremelybasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChallangeExtremelyBasic {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int a,b, sum;

        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());
        
        sum = a + b;
        
        System.out.printf("X = %d\n", sum);
    }

}
