package evenbetweenfivenumbers;

import java.util.Scanner;

public class EvenBetweenFiveNumbers {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        byte totPositives = 0;
        
        for (int i = 0; i < 5; i++) {
            int input = Integer.parseInt(k.nextLine());
            if (input % 2 == 0) {
                totPositives++;
            }
        }
        
        System.out.printf("%d valores pares\n", totPositives);
    }
}
