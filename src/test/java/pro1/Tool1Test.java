package pro1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class Tool1Test
{
    @Test
    void test01()
    {
        assertEquals(
                "2018-11-30T18:35:24Z",
                Tool1.czechDateTimeStringToUTC("30. 11. 2018 19:35:24").toString()
        );
    }
    @Test
    void test02()
    {
        assertEquals(
                "2019-08-30T18:35:24Z",
                Tool1.czechDateTimeStringToUTC("30. 8. 2019 20:35:24").toString()
        );
    }
}
