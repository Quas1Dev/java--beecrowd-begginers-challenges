package triangle;

import java.util.Scanner;

public class Triangle {
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        float[] sides = convert(k.nextLine().split(" "));
         
        if (sides[0] + sides[1] > sides[2] &&
            sides[0] + sides[2] > sides[1] &&
            sides[1] + sides[2] > sides[0]) {
            System.out.printf("Perimetro = %.1f\n", sides[0] + sides[1] + sides[2]);
        }else{
            System.out.printf("Area = %.1f\n", 
                    ((sides[0] + sides[1]) * sides[2])/2 );
        }
        
    }

    private static float[] convert(String[] array) {
      
        float[] numberArray = new float[array.length];

        for (int i = 0; i < array.length; i++) {
            numberArray[i] = Float.parseFloat(array[i]);
        }

        return numberArray;
    }
}
