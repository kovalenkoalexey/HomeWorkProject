import java.util.ArrayList;

public class DigitToWord {
    public static String getWordMillions(int millions) {
        String s = "миллионов ";
        if (millions % 100 != 11 && millions % 10 == 1)
            s = "миллион ";
        else {
            if ((millions % 100 != 12 && millions % 10 == 2) ||
                    (millions % 100 != 13 && millions % 10 == 3) ||
                    (millions % 100 != 14 && millions % 10 == 4))
                s = "миллиона ";
        }
        return s;
    }

    public static String getWordThousands(int thousands) {
        String s = "тысяч ";
        if (thousands % 100 != 11 && thousands % 10 == 1) {
            s = "тысяча ";
        }
        if ((thousands % 100 != 12 && thousands % 10 == 2) ||
                (thousands % 100 != 13 && thousands % 10 == 3) ||
                (thousands % 100 != 14 && thousands % 10 == 4)) {
            s = "тысячи ";
        }
        return s;
    }

    public static String getHundreds(int number) {
        String s;
        int n = number / 100;
        ArrayList<String> hundreds = new ArrayList<>();
        hundreds.add("");
        hundreds.add("сто ");
        hundreds.add("двести ");
        hundreds.add("триста ");
        hundreds.add("четыреста ");
        hundreds.add("пятьсот ");
        hundreds.add("шестьсот ");
        hundreds.add("семьсот ");
        hundreds.add("восемьсот ");
        hundreds.add("девятьсот ");
        s = hundreds.get(n);
        return s;
    }

    public static String getTens(int number) {
        String s = "";
        int n = (number % 100) / 10;
        ArrayList<String> tens = new ArrayList<>();
        tens.add("");
        tens.add("");
        tens.add("двадцать ");
        tens.add("тридцать ");
        tens.add("сорок ");
        tens.add("пятьдесят ");
        tens.add("шестьдесят ");
        tens.add("семьдесят ");
        tens.add("восемьдесят ");
        tens.add("девяносто ");
        s = tens.get(n);
        return s;
    }

    public static String getBelowTwenty(int number, boolean isThousands) {
        String s;
        int n = number % 100;
        ArrayList<String> belowTwenty = new ArrayList<>();
        belowTwenty.add("");
        belowTwenty.add("один ");
        belowTwenty.add("два ");
        belowTwenty.add("три ");
        belowTwenty.add("четыре ");
        belowTwenty.add("пять ");
        belowTwenty.add("шесть ");
        belowTwenty.add("семь ");
        belowTwenty.add("восемь ");
        belowTwenty.add("девять ");
        belowTwenty.add("десять ");
        belowTwenty.add("одиннадцать ");
        belowTwenty.add("двеннадцать ");
        belowTwenty.add("тринадцать ");
        belowTwenty.add("четырнадцать ");
        belowTwenty.add("пятнадцать ");
        belowTwenty.add("шестнадцать ");
        belowTwenty.add("семнадцать ");
        belowTwenty.add("восемнадцать ");
        belowTwenty.add("девятнадцать ");
        if (isThousands) {
            belowTwenty.set(1, "одна ");
            belowTwenty.set(2, "две ");
        }
        if (n >= 0 && n < 20)
            s = belowTwenty.get(n);
        else {
            n %= 10;
            s = belowTwenty.get(n);
        }
        return s;
    }
}