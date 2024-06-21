package distancebetweentwopoints;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistanceBetweeTwoPoints {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        List<Float> ls = new ArrayList<>();
        
        String[] firstPoint = k.nextLine().split(" ");
        String[] secondPoint = k.nextLine().split(" ");
        
        for (int i = 0; i < firstPoint.length; i++) {
            ls.add(Float.parseFloat(firstPoint[i]));
        }
        
        for (int i = 0; i < secondPoint.length; i++) {
            ls.add(Float.parseFloat(secondPoint[i]));
        }
        
        float distance = (float) Math.sqrt(
                (ls.get(2) - ls.get(0)) *
                (ls.get(2) - ls.get(0)) + 
                (ls.get(3) - ls.get(1)) * 
                (ls.get(3) - ls.get(1))
        );
        
        System.out.printf("%.4f\n",distance);
    }
    
}
