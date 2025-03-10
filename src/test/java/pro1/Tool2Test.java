package pro1;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tool2Test
{
    @Test
    void test01()
    {
        ZonedDateTime zonedDateTime1 = LocalDateTime.parse("2025-12-26T20:00").atZone(ZoneId.of("Europe/Prague"));
        ZonedDateTime zonedDateTime2 = LocalDateTime.parse("2025-12-26T21:00").atZone(ZoneId.of("Europe/Prague"));
        assertEquals(
                1,
                Tool2.hourDiff(zonedDateTime1, zonedDateTime2)
        );
    }
    @Test
    void test02()
    {
        ZonedDateTime zonedDateTime1 = LocalDateTime.parse("2025-10-26T01:00").atZone(ZoneId.of("Europe/Prague"));
        ZonedDateTime zonedDateTime2 = LocalDateTime.parse("2025-10-26T06:00").atZone(ZoneId.of("Europe/Prague"));
        assertEquals(
                5,
                Tool2.hourDiff(zonedDateTime1, zonedDateTime2)
        );
    }
}
