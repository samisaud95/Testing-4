import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import static junit.framework.TestCase.assertEquals;


class MainTest {
    ZonedDateTime dataTime = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();

    @Test
    void formatoFull() {
        String result = Main.formatoFull(dataTime);
        assertEquals("mercoledi 1 marzo 2023",result);
    }
}