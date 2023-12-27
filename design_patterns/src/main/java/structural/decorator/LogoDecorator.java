package structural.decorator;

public class LogoDecorator extends PrintingServiceDecorator{
    public LogoDecorator(PrintingService printingService) {
        super(printingService);
    }

    @Override
    public void printMessage(String message){
        super.printMessage(addLogo(message));
    }

    private String addLogo(String message) {
        return message + "'Nice Logo'";
    }
}
