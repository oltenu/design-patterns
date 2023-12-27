package behavioral.command.command;

public class PrintHelloCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Hello!");
    }
}
