package interval;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        float number = k.nextFloat();
        
        if (number >= 0f && number <= 25f) {
            System.out.println("Intervalo [0,25]");
        } else if(number > 25 && number <= 50f ){
            System.out.println("Intervalo (25,50]");
        } else if ( number > 50 && number <= 75f){
            System.out.println("Intervalo (50,75]");
        } else if ( number > 75 && number <= 100f){
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
