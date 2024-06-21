package simplesort;

import java.util.Scanner;

public class SimpleSort {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int[] unsortedList = convert(k.nextLine().split(" "));
        int[] list = unsortedList.clone();

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < (list.length - i - 1); j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        System.out.println();

        for (int i = 0; i < unsortedList.length; i++) {
            System.out.println(unsortedList[i]);
        }
    }

    private static int[] convert(String[] array) {
        int[] numberArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            numberArray[i] = Integer.parseInt(array[i]);
        }

        return numberArray;
    }
}
