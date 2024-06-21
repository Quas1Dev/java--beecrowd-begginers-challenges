package month;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Map<Integer, String> months = new HashMap<>();
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
                
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");
        
        Scanner k = new Scanner(System.in);
        int month = k.nextInt();
        
        System.out.println(months.get(month));
    }
}
