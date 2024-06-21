package interval2;

import java.util.Scanner;

public class Interval2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        int totTests = k.nextInt();
        float[] tests = new float[totTests];
        
        for (int i = 0; i < totTests; i++) {
            tests[i] = k.nextInt();
        }
        
        int in = 0, out = 0;
        
        for (int i = 0; i < tests.length; i++) {
            if (tests[i] >= 10 && tests[i] <= 20) {
                in++;
            } else {
                out++;
            }
        }
        
        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);
    }
}
