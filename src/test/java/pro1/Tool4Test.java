package pro1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tool4Test
{
    @Test
    void test01()  {
        Number[] numbers = {200, 68f, 5.6, 400, new Fraction(1000,2)};
        assertEquals(
                500d,
                Tool4.maximumValue(numbers)
        );
    }

}
