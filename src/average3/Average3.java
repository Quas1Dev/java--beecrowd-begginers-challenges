package average3;

import java.math.*; import java.util.*;

public class Average3 {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String[] line = k.nextLine().split(" ");
        float[] grades = new float[line.length+1];

        for (int i = 0; i < line.length; i++) {
            grades[i] = Float.parseFloat(line[i]);
        }

        double average = (grades[0] * 2 + grades[1] * 3 + grades[2] * 4 + grades[3] * 1) / 10;

        System.out.printf(Locale.ENGLISH, "Media: %.1f\n", average);
        if (average >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (average >= 5.0f && average <= 6.9) {

            System.out.println("Aluno em exame.");
            
            try {
                grades[grades.length - 1] = k.nextFloat();
            } catch(Exception e){
                grades[grades.length - 1] = 0.0f;
            }
            
            System.out.printf(Locale.ENGLISH, "Nota do exame: %.1f\n", grades[4]);
            average = (average + grades[4]) / 2;

            if (average >= 5) {
                System.out.println("Aluno aprovado.");

            } else {
                System.out.println("Aluno reprovado");
            }
            System.out.printf(Locale.ENGLISH, "Media final: %.1f\n", average);

        } else if( average < 5) {
            System.out.println("Aluno reprovado.");
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
