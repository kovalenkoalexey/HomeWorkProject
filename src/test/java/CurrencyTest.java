import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyTest {

    @Test
    void getCurrencyRubles() {
        String actual = Currency.RUBLES.getCurrency(3);
        String expected = "рубля";
        assertEquals(expected, actual);
    }

    @Test
    void getCurrencyDollars() {
        String actual = Currency.DOLLARS.getCurrency(19);
        String expected = "долларов";
        assertEquals(expected, actual);
    }
}