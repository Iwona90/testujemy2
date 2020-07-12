package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Zad14 {
    public static void main(String[] args) {
        LocalDateTime localDateAsiaTokio = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("LocalDateTime - Asia/Tokyo: " + localDateAsiaTokio);

    }
}
