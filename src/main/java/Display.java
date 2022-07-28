import java.util.Scanner;

public class Display {
    public void displaying() {
        Validator minValue = new MinValueValidator();
        Validator maxValue = new MaxValueValidator();
        Assembling assembling = new Assembling();
        Input consoleIn  = new ConsoleInput();
        Output consoleOut = new ConsoleOutput();
        int number;
        String s;
        System.out.println("Введите сумму от 0 до 999 999 999: ");
        number = consoleIn.in(new Scanner(System.in));
        if (minValue.validate(number) && (maxValue.validate(number))) {
            s = assembling.assemble(number);
            consoleOut.out(s);
            displaying();
        } else
            displaying();
    }

    public static void main(String[] args) {
        Display display = new Display();
        display.displaying();
    }
}