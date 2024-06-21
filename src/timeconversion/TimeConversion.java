package timeconversion;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int totSeconds = k.nextInt();
        
        // Decoposing
        int hours = Math.floorDiv(totSeconds, 3600);
        int min = Math.floorDiv(totSeconds % 3600, 60);
        int seconds = (totSeconds % 3600) % 60;
        System.out.printf("%d:%d:%d\n", hours,min,seconds);
        
    }
}
