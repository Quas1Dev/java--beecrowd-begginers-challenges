package oddnumbers;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int input = k.nextInt();
        for (int i = 1; i <= input; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
