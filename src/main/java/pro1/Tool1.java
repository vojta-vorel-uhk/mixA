package pro1;

import java.time.*;
import java.time.format.DateTimeFormatter;


public class Tool1 {
    public static Instant czechDateTimeStringToUTC(String string)
    {
        LocalDateTime localDateTime =
                LocalDateTime.parse(
                        string,
                        DateTimeFormatter.ofPattern("d. M. yyyy HH:mm:ss"));

        Instant utc = localDateTime.toInstant(ZoneOffset.ofHours(1));

        return utc;
    }
}
