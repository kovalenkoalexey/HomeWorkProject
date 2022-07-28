public class MinValueValidator implements Validator{
    @Override
    public Boolean validate(int number) {
        Boolean isInRange;
        if (number < 0) {
            System.err.println("Введенное число ниже минимально допустимого предела.");
            isInRange = false;
        }
        else isInRange = true;
        return isInRange;
    }
}
