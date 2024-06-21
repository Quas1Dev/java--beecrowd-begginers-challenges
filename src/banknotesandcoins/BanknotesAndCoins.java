package banknotesandcoins;

import java.io.IOException;
import java.math.*;
import java.util.*;

public class BanknotesAndCoins {

    public static void main(String[] args) throws IOException{

        SortedMap<Integer, Integer> banknotes = new TreeMap(Collections.reverseOrder());
        banknotes.put(100, 0);
        banknotes.put(50, 0);
        banknotes.put(20, 0);
        banknotes.put(10, 0);
        banknotes.put(5, 0);
        banknotes.put(2, 0);

        SortedMap<Float, Integer> coins = new TreeMap(Collections.reverseOrder());
        coins.put(1.00f, 0);
        coins.put(0.50f, 0);
        coins.put(0.25f, 0);
        coins.put(0.10f, 0);
        coins.put(0.05f, 0);
        coins.put(0.01f, 0);

        Scanner k = new Scanner(System.in);
        float amount = Float.parseFloat(k.nextLine());

        for (Integer note : banknotes.keySet()) {
            while (amount - note >= 0) {

                amount = round(amount - note, 2);
                banknotes.put(note, banknotes.get(note) + 1);
            }
        }

        for (Float coin : coins.keySet()) {
            while (amount - coin >= 0) {
                amount = round(amount - coin, 2);
                coins.put(coin, coins.get(coin) + 1);
            }
        }

        System.out.println("NOTAS:");
        for (Integer note : banknotes.keySet()) {
            System.out.printf(Locale.ENGLISH, "%d nota(s) de R$ %d.00\n", banknotes.get(note), note);
        }

        System.out.println("MOEDAS:");
        for (Float coin : coins.keySet()) {
            System.out.printf(Locale.ENGLISH, "%d moeda(s) de R$ %.2f\n", coins.get(coin), coin);
        }
    }

    public static float round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
}
