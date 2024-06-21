package evensquare;

import java.util.Scanner;

public class EvenSquare {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int input = k.nextInt();

        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d^2 = %d\n", i, (i * i));
            }
        }
    }
}
