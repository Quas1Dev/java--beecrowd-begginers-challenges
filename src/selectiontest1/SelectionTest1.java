package selectiontest1;

import java.util.Scanner;

public class SelectionTest1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String[] line = k.nextLine().split(" ");
        int[] numbers = new int[line.length];
        
        for (int i = 0; i < line.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }
        
        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];
        int d = numbers[3];
        
        if (b > c && 
            d > a && 
            c+d > a + b && 
            c > 0 &&  
            d > 0 && 
            a % 2 == 0) {
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
   
}
