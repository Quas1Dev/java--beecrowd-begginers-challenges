
package ddd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DDD {
    public static void main(String[] args) {
        Map<Integer, String> ddds =  new HashMap<>();
        ddds.put(61, "Brasilia");
        ddds.put(71, "Salvador");
        ddds.put(11, "Sao Paulo");
        ddds.put(21, "Rio de Janeiro");
        ddds.put(32, "Juiz de Fora");
        ddds.put(19, "Campinas");
        ddds.put(27, "Vitoria");
        ddds.put(31, "Belo Horizonte");
        
        Scanner k = new Scanner(System.in);
        int ddd = k.nextInt();
        if (ddds.get(ddd) != null) {
            System.out.println(ddds.get(ddd));
        } else {
            System.out.println("DDD nao cadastrado");
        }
        
    }
}
