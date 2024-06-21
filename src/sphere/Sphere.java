package sphere;

import java.io.IOException;
import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) throws IOException{
        Scanner k = new Scanner(System.in);
        double r = Double.parseDouble(k.nextLine());
        
        
        double pi = 3.14159;
        double v =  ((4.0/3) * pi) * (r * r * r);
        System.out.printf("VOLUME = %.3f\n", v);
    }
}
