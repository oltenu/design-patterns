package structural.decorator;

public class PrintMessage implements PrintingService{
    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }
}
