package DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class Zad13 {
    public static void main(String[] args) {
        LocalTime localTime1 = LocalTime.of(14,11);
        LocalTime localTime2 = LocalTime.of(18,41);

        Duration duration = Duration.between(localTime1,localTime2);
        System.out.println(duration);


    }
}
