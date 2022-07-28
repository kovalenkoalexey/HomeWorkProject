import java.util.Scanner;

public class ConsoleInput implements Input {
    @Override
    public int in(Scanner scan) {
        int number = 0;
        if (scan.hasNextInt())
            number = scan.nextInt();
        else
            System.err.println("Введены некорректные знаки.");
        return number;
    }
}