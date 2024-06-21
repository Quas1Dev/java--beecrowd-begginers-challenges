package sumofconsecutiveoddnumbers;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbers {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int[] inputs = new int[2];
        for (int i = 0; i < 2; i++) {
            inputs[i] = k.nextInt();
        }

        if (inputs[0] > inputs[1]) {
            int temp = inputs[0];
            inputs[0] = inputs[1];
            inputs[1] = temp;
        }
        
        int start = inputs[0];
        int end = inputs[1];
        int sum = 0;
        for (int i = start + 1; i < end; i++) {
            if (i % 2 != 0) {
            
                sum += i;
            }
        }
        
        System.out.println(sum);

    }
}
