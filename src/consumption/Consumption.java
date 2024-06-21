package consumption;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        int x = Integer.parseInt(k.nextLine());
        float y = Float.parseFloat(k.nextLine());
        
        System.out.printf("%.3f km/l\n", (x / y));
    }
}
