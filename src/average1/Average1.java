package average1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average1 {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        
        float g1 = Float.parseFloat(bf.readLine());
        float g2 = Float.parseFloat(bf.readLine());
        float average = ((g1*3.5f + g2 * 7.5f) / (3.5f + 7.5f));
        System.out.printf("MEDIA = %.5f\n", average);
    }
}
