package ageindays;

import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int totDays = k.nextInt();
        
        // Decomposing
        int years = Math.floorDiv(totDays, 365);
        int months = Math.floorDiv(totDays % 365, 30);
        int days = (totDays % 365)% 30;
        
        System.out.printf("%d ano(s)\n", years);
        System.out.printf("%d mes(es)\n", months);
        System.out.printf("%d dia(s)\n", days);
        
    }
}
