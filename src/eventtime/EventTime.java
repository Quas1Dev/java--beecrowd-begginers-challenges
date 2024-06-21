package eventtime;

import java.util.Scanner;

public class EventTime {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String[] lines = new String[4];

        for (int i = 0; i < 4; i++) {
            lines[i] = k.nextLine();
        }
        
        int d, h, m, s, dd, hh, mm, ss;

        d = Integer.parseInt(lines[0].replaceAll("[^0-9]", ""));
        h = Integer.parseInt(lines[1].split(" : ")[0]);
        m = Integer.parseInt(lines[1].split(" : ")[1]);
        s = Integer.parseInt(lines[1].split(" : ")[2]);

        dd = Integer.parseInt(lines[2].replaceAll("[^0-9]", ""));
        hh = Integer.parseInt(lines[3].split(" : ")[0]);
        mm = Integer.parseInt(lines[3].split(" : ")[1]);
        ss = Integer.parseInt(lines[3].split(" : ")[2]);

        d = dd - d;
        h = hh - h;
        m = mm - m;
        s = ss - s;
        
        if (s < 0) {
            s += 60;
            m--;
        }

        if (m < 0) {
            m += 60;
            h--;
        }

        if (h < 0) {
            h += 24;
            d--;
        }
        
        System.out.printf("%d dia(s)\n", d);
        System.out.printf("%d hora(s)\n", h);
        System.out.printf("%d minuto(s)\n", m);
        System.out.printf("%d segundo(s)\n", s);
        
//        int dayStart = Integer.parseInt(lines[0].replaceAll("[^0-9]", ""));
//        int hourStart = Integer.parseInt(lines[1].split(" : ")[0]);
//        int minuteStart = Integer.parseInt(lines[1].split(" : ")[1]);
//        int secStart = Integer.parseInt(lines[1].split(" : ")[2]);
//        
//        int dayEnd = Integer.parseInt(lines[2].replaceAll("[^0-9]", ""));
//        int hourEnd = Integer.parseInt(lines[3].split(" : ")[0]);
//        int minuteEnd = Integer.parseInt(lines[3].split(" : ")[1]);
//        int secEnd = Integer.parseInt(lines[3].split(" : ")[2]);
//       
//        // Unify start timings - Represents seconds, minutes, hours and days
//        // as with an unique number.
//        double startTime = dayStart +
//                           (hourStart / 24f) +
//                           (minuteStart / 1440f) +
//                           (secStart / 86400f);
//        
//        // Unify end timing - Represents seconds, minutes, hours and days
//        // as with an unique number.
//        double endTime = dayEnd +
//                           (hourEnd / 24f) +
//                           (minuteEnd / 1440f) +
//                           (secEnd / 86400f);;
//        
//        // Calculate unified event timing
//        double eventTiming = (endTime - startTime);
//        
//        
//        int eventDays = (int) eventTiming;
//        int eventHours = (int) ((eventTiming - eventDays) * 24);
//        int eventMinute = (int) ((((eventTiming - eventDays) * 24) - eventHours) * 60);
//        long eventSec =  Math.round((((((eventTiming - eventDays) * 24) - eventHours) * 60) - eventMinute) * 60);
//        
//        // Adjust time units
//        if (eventSec >= 60) {
//            eventSec = 0 + eventSec - 60;
//            eventMinute++;
//        } 
//        
//        if (eventMinute >= 60) {
//            eventMinute = 0 + eventMinute - 60;
//            eventHours++;
//        }
//        
//        if (eventHours >= 24) {
//            eventHours = 0 + eventHours - 24;
//            eventDays++;
//        }
//        
//        System.out.printf("%d dia(s)\n", eventDays);
//        System.out.printf("%d hora(s)\n", eventHours);
//        System.out.printf("%d minuto(s)\n", eventMinute);
//        System.out.printf("%d segundo(s)\n", eventSec);
//        ;
    }
}
