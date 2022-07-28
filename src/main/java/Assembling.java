public class Assembling {
    public String assemble(int number) {
        String s = "";
        int millions = number / 1000000;
        int thousands = (number / 1000) % 1000;
        int belowThousands = number % 1000;
        Currency currency = Currency.RUBLES;

        if ((millions == 0) && (thousands == 0) && (belowThousands == 0)) {
            s = "ноль ";
        } else {
            if (millions != 0) {
                s += DigitToWord.getHundreds(millions);
                s += DigitToWord.getTens(millions);
                s += DigitToWord.getBelowTwenty(millions, false);
                s += DigitToWord.getWordMillions(millions);
            }
            if (thousands != 0) {
                s += DigitToWord.getHundreds(thousands);
                s += DigitToWord.getTens(thousands);
                s += DigitToWord.getBelowTwenty(thousands, true);
                s += DigitToWord.getWordThousands(thousands);
            }
            if (belowThousands != 0) {
                s += DigitToWord.getHundreds(belowThousands);
                s += DigitToWord.getTens(belowThousands);
                s += DigitToWord.getBelowTwenty(belowThousands, false);
            }
        }
        if (s == "ноль ")
            return "";
        s += currency.getCurrency(number);
        return s;
    }
}