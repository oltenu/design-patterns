package structural.decorator;

public class GreetingDecorator extends PrintingServiceDecorator{
    public GreetingDecorator(PrintingService printingService) {
        super(printingService);
    }

    @Override
    public void printMessage(String message){
        super.printMessage(addGreeting(message));
    }

    private String addGreeting(String message){
        return "Hello! " + message;
    }
}
