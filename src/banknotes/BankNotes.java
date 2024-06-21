package banknotes;

import java.io.IOException;
import java.util.*;

public class BankNotes {
    public static void main(String[] args) throws IOException{
        SortedMap<Integer,Integer> banknotes = new TreeMap(Collections.reverseOrder());
        
        banknotes.put(100, 0);
        banknotes.put(50, 0);
        banknotes.put(20, 0);
        banknotes.put(10, 0);
        banknotes.put(5, 0);
        banknotes.put(2, 0);
        banknotes.put(1, 0);
        
        Scanner k = new Scanner(System.in);
        float amount = k.nextFloat();
        System.out.printf("%.0f\n", amount);
        
        for(Integer note : banknotes.keySet()){
            while(amount - note >= 0){
                amount = amount - note;
                banknotes.put(note, banknotes.get(note) + 1);
            }
        }
        
        
        for(Integer note: banknotes.keySet()){
            System.out.printf("%d nota(s) de R$ %d,00\n", banknotes.get(note), note);
        }
        
    }
}
