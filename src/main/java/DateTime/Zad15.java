package DateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Zad15 {
    public static void main(String[] args) {
        LocalTime localTimeBydgoszcz = LocalTime.now(ZoneId.of("Europe/Paris"));
        DateTimeFormatter time = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        System.out.println(localTimeBydgoszcz);
    }
}
