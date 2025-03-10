package pro1;

import org.junit.jupiter.api.Test;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tool3Test
{
    @Test
    void test01() throws URISyntaxException {
        URL url = this.getClass().getResource("/1.txt");
        assertEquals(
                "Jasno:138,Nedostupné:1,Polojasno:103,Selhání měřidla:1,Zataženo:124",
                Tool3.analyze(Paths.get(url.toURI()))
        );
    }

}
