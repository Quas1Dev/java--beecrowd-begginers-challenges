package multiples;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[] numbers = convert(k.nextLine().split(" "));
        
        if (numbers[0] % numbers[1] == 0 || 
            numbers[1] % numbers[0] == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }

    private static int[] convert(String[] array) {
        int[] numberArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numberArray[i] = Integer.parseInt(array[i]);
        }

        return numberArray;
    }
}
