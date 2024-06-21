package gametimewithminutes;

import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        int [] times = convert(k.nextLine().split(" "));
        
        float startTime = times[0] + (times[1] / 60f);
        float endTime = times[2] + (times[3] / 60f);
        float eventElapse;
        
        if (endTime > startTime) {
            eventElapse = endTime - startTime;
        } else {
            eventElapse = (24 - startTime) + endTime;
        }
        
        int eventHours = (int) Math.floor(eventElapse);
        int eventMinutes = (int) Math.round((eventElapse - Math.floor(eventElapse)) * 60);
        
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",
                eventHours, eventMinutes);
        
    }
    
    private static int[] convert (String[] array){
        int[] numberArray = new int[array.length];
        
        for (int i = 0; i < array.length; i++) {
            numberArray[i] = Integer.parseInt(array[i]);
        }
        
        return numberArray;
    }
}
