package structural.decorator;

public class PrintingServiceDecorator implements PrintingService{
    private final PrintingService printingService;

    public PrintingServiceDecorator(PrintingService printingService){
        this.printingService = printingService;
    }

    @Override
    public void printMessage(String message) {
        printingService.printMessage(message);
    }
}
