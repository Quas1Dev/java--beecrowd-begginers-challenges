package positiveandaverage;

import java.util.Scanner;

public class PositiveAndAverage {
    public static void main(String[] args) {
        double[] inputs = new double[6];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            inputs[i] = k.nextDouble();
        }
        int totPositives = 0;
        double average = 0;
        
        for( double input : inputs){
            if (input > 0) {
                totPositives++;
                average += input;
            } 
        }
        
        average /= totPositives;
        
        System.out.printf("%d valores positivos\n", totPositives);
        System.out.printf("%.1f\n", average);
    }
}
