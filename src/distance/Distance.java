package distance;

import java.io.IOException;
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) throws IOException{
        Scanner k = new Scanner(System.in);
        
        int n = k.nextInt();
        
        int min = (60 * n) /30;
        System.out.printf("%d minutos\n", min);
    }
}
