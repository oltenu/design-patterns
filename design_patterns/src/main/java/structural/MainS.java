package structural;

import structural.adapter.*;
import structural.composite.*;
import structural.decorator.*;

public class MainS {
    public static void main(String[] args) {
        //          --ADAPTER--
        System.out.println("ADAPTER:");
        NewDatabaseService newDatabaseService = new NewDatabaseService();
        newDatabaseService.executeQuery("SELECT *");

        NewDatabaseService adapterService = new OldDatabaseAdapterService();
        adapterService.executeQuery("SELECT ALL");
        System.out.println("\n");

        //          --COMPOSITE--
        System.out.println("COMPOSITE:");
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box3.addItem(new Item(12));
        box2.addItem(new Item(20));
        box2.addItem(new Item(15));
        box2.addItem(box3);
        box1.addItem(box2);
        box1.addItem(new Item(5));

        System.out.println(box1.getPrice());

        System.out.println("\n");

        //          --DECORATOR
        System.out.println("DECORATOR: ");
        PrintingServiceDecorator decorator = new GreetingDecorator(
                new LogoDecorator(
                        new PrintMessage()));

        decorator.printMessage("How are you?");
    }
}
