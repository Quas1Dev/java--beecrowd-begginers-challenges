package triangletypes;

import java.util.Scanner;

public class TriangleTypes {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        float[] sides = convert(k.nextLine().split(" "));
        sides = bubbleSort(sides);
        
        float a = sides[0];
        float b = sides[1];
        float c = sides[2];

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(a, 2)
                    == Math.pow(b, 2)
                    + Math.pow(c, 2)) {
                System.out.println("TRIANGULO RETANGULO");

            }
            if (Math.pow(a, 2)
                    > Math.pow(b, 2)
                    + Math.pow(c, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(a, 2)
                    < Math.pow(b, 2)
                    + Math.pow(c, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && a == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (a == b && a != c
                    || a == c && a != b
                    || b == c && b != a) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }

    private static float[] bubbleSort(float[] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] < values[j + 1]) {
                    float temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        return values;
    }

    private static float[] convert(String[] array) {

        float[] numberArray = new float[array.length];

        for (int i = 0; i < array.length; i++) {
            numberArray[i] = Float.parseFloat(array[i]);
        }

        return numberArray;
    }
}
