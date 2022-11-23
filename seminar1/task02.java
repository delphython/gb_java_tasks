/*
 * В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
 * "Доброе утро, <Имя>!", если время от 05:00 до 11:59
 * "Добрый день, <Имя>!", если время от 12:00 до 17:59;
 * "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
 * "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
 */

import java.io.Console;
import java.time.LocalTime;

public class task02 {
    public static void main(String[] args) {
        LocalTime morningTimeStart = LocalTime.parse("05:00:00");
        LocalTime afternoonTimeStart = LocalTime.parse("12:00:00");
        LocalTime eveningTimeStart = LocalTime.parse("18:00:00");
        LocalTime nightTimeStart = LocalTime.parse("23:00:00");

        Console console = System.console();
        
        String userName = console.readLine("Введите Ваше имя: ");

        LocalTime target = LocalTime.now();
        
        Boolean isTargetMorning = (
            target.isAfter(morningTimeStart) 
            && target.isBefore(afternoonTimeStart)
        );
        Boolean isTargetAfternoon = (
            target.isAfter(afternoonTimeStart) 
            && target.isBefore(eveningTimeStart)
        );
        Boolean isTargetEvening = (
            target.isAfter(eveningTimeStart) 
            && target.isBefore(nightTimeStart)
        );

        String welcomeString = isTargetMorning ? "Доброе утро" : 
            isTargetAfternoon ? "Добрый день" :
            isTargetEvening ? "Добрый вечер" : "Доброй ночи";

        console.printf(String.format("%s, %s!", welcomeString, userName));
    }
}
