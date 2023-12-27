package behavioral.command.command;

public class AnotherCommand implements Command {
    @Override
    public void execute() {
        System.out.println("How are you?");
    }
}
