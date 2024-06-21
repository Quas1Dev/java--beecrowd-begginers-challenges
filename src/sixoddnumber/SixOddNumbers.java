package sixoddnumber;

import java.util.Scanner;

public class SixOddNumbers {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        int input = k.nextInt();
        
        int totOdd = 0;
        
        while(totOdd < 6){
            if (input % 2 != 0) {
                System.out.println(input);
                totOdd++;
            }
            input++;
        }
    }
}
