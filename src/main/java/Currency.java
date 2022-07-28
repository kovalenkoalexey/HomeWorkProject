public enum Currency {
    RUBLES(new String[]{"рублей", "рубль", "рубля"}), DOLLARS(new String[]{"долларов", "доллар", "доллара"});
    private String[] values;

    Currency(String[] values) {
        this.values = values;
    }

    String getCurrency(int number) {
        String s = values[0];
        if (number % 100 != 11 && number % 10 == 1)
            s = values[1];
        else if ((number % 100 != 12 && number % 10 == 2) ||
                (number % 100 != 13 && number % 10 == 3) ||
                (number % 100 != 14 && number % 10 == 4)) {
            s = values[2];
        }
        return s;
    }
}