package fuelspent;

import java.io.IOException;
import java.util.Scanner;

public class FuelSpent {
    public static void main(String[] args) throws IOException{
       Scanner k = new Scanner(System.in);
       int time = k.nextInt();
       int averageSpeed = k.nextInt();
       float distance = time * averageSpeed;
       float neededFuel = distance / 12;
       System.out.printf("%.3f\n", neededFuel);
    }
}
