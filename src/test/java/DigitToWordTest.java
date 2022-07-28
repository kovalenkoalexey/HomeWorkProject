import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitToWordTest {

    @Test
    void getWordMillions() {
        DigitToWord digitToWord = new DigitToWord();
        String actual = digitToWord.getWordMillions(19);
        String expected = "миллионов ";
        assertEquals(expected, actual);
    }

    @Test
    void getWordThousands() {
        DigitToWord digitToWord = new DigitToWord();
        String actual = digitToWord.getWordThousands(22);
        String expected = "тысячи ";
        assertEquals(expected, actual);
    }

    @Test
    void getHundreds() {
        DigitToWord digitToWord = new DigitToWord();
        String actual = digitToWord.getHundreds(800);
        String expected = "восемьсот ";
        assertEquals(expected, actual);
    }

    @Test
    void getTens() {
        DigitToWord digitToWord = new DigitToWord();
        String actual = digitToWord.getTens(30);
        String expected = "тридцать ";
        assertEquals(expected, actual);
    }

    @Test
    void getBelowTwenty() {
        DigitToWord digitToWord = new DigitToWord();
        String actual = digitToWord.getBelowTwenty(15, true);
        String expected = "пятнадцать ";
        assertEquals(expected, actual);
    }
}