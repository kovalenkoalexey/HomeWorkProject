public class ConsoleOutput implements Output{
    @Override
    public void out(String s) {
        System.out.println(s);
    }
}