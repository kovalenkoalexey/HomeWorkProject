public class MaxValueValidator implements Validator{
    @Override
    public Boolean validate(int number) {
        Boolean isInRange;
        if (number > 999999999) {
            System.err.println("Введенное число выше максимально допустимого предела.");
            isInRange = false;
        }
        else isInRange = true;
        return isInRange;
    }
}
