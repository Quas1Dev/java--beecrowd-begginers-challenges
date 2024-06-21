package positivenumbers;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        int counter = 0;
        
        for (int i = 1; i <= 6; i++) {
            float number = k.nextFloat();
            if (number > 0) {
                counter++;
            }
        }        
        
        System.out.printf("%d valores positivos\n", counter);
    }
}
