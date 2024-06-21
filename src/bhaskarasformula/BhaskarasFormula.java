package bhaskarasformula;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BhaskarasFormula {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        String[] line = k.nextLine().split(" ");
        double[] values = new double[line.length];

        for (int i = 0; i < line.length; i++) {
            values[i] = Double.parseDouble(line[i]);
        }

        double a = values[0];
        double b = values[1];
        double c = values[2];

        double delta = Math.pow(b, 2) - 4 * a * c;
    
        if (delta > 0 && a != 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
        } else {
            System.out.printf("Impossivel calcular\n");
        }

    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
