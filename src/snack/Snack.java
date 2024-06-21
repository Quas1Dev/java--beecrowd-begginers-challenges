package snack;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Snack {
    public static void main(String[] args) {
        Map<Integer, Float> menu = new HashMap();
        menu.put(1, 4.00f);
        menu.put(2, 4.50f);
        menu.put(3, 5.00f);
        menu.put(4, 2.00f);
        menu.put(5, 1.50f);
        
        Scanner k = new Scanner(System.in);
        String[] line = k.nextLine().split(" ");
        int productCode = Integer.parseInt(line[0]);
        int qtd = Integer.parseInt(line[1]);
        
        System.out.printf("Total: R$ %.2f\n", menu.get(productCode) * qtd);
        
    }
}
