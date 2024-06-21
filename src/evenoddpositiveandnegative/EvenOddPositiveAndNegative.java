package evenoddpositiveandnegative;

import java.util.Scanner;

public class EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int totEven = 0;
        int totOdd = 0;
        int totPositive = 0;
        int totNegative = 0;
        
        for (int i = 0; i < 5; i++) {
            int input = k.nextInt();
            if (input % 2 == 0) {
                totEven++;
            } else {
                totOdd++;
            }
            
            if (input > 0) {
                totPositive++;
            } else if (input<0){
                totNegative++;
            }
        }
        
        System.out.printf("%d valor(es) par(es)\n", totEven);
        System.out.printf("%d valor(es) impar(es)\n", totOdd);
        System.out.printf("%d valor(es) positivo(s)\n", totPositive);
        System.out.printf("%d valor(es) negativo(s)\n", totNegative);
    }
}
