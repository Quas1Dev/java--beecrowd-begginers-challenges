package gametime;

import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String[] line = k.nextLine().split(" ");
        int startHour = Integer.parseInt(line[0]);
        int endHour = Integer.parseInt(line[1]);
        
        int eventDuration;
        if (endHour > startHour) {
            eventDuration = endHour - startHour;
        } else {
            eventDuration = (24 - startHour) + endHour;
        }
        
        System.out.println("O JOGO DUROU "+ eventDuration +" HORA(S)");
        
    }
}
