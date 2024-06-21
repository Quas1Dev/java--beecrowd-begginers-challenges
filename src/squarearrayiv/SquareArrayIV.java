package squarearrayiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SquareArrayIV {

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        Scanner k = new Scanner(System.in);
  
        List<Integer> sizes = new ArrayList<>();
        
        while (k.hasNext()){
            sizes.add(k.nextInt()); 
        };
        
        for (int size : sizes) {
  
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == Math.floor(size / 2) && j == Math.floor(size / 2)) {
                        System.out.print("4");
                    } else if (i >= Math.floor(size / 3.0)
                           && (j >= Math.floor(size / 3.0)
                           && (j < Math.ceil(size / 3.0 + size / 3.0))
                           && (i < Math.ceil(size / 3.0 + size / 3.0)))) {
                        System.out.print("1");
                    } else if (i == j) {
                        System.out.print("2");
                    } else if (i + j == size - 1) {
                        System.out.print("3");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
            System.out.println();
        };
    }
}
