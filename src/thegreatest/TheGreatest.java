package thegreatest;

import java.io.IOException;
import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args) throws IOException{
        Scanner k = new Scanner(System.in);
        String[] s = k.nextLine().split(" ");
        int maior = 0;
        
        for (String item : s) {
            int temp = Integer.parseInt(item);
            if (temp > maior) {
                maior = temp;
            }
        }
        
        System.out.printf("%d eh o maior\n", maior);
        
    }
}
