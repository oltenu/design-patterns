package behavioral;

import behavioral.command.Commander;
import behavioral.observer.Publisher;
import behavioral.observer.listeners.MagazineArchiver;
import behavioral.observer.listeners.NewsPaperArchiver;
import behavioral.observer.publication.Magazine;
import behavioral.observer.publication.NewsPaper;
import behavioral.strategy.Calculator;
import behavioral.strategy.strategy.*;

public class MainB {
    public static void main(String[] args) {
        //          --OBSERVER--
        System.out.println("OBSERVER:");
        Publisher publisher = new Publisher();
        publisher.eventManager.subscribe("Magazine", new MagazineArchiver());
        publisher.eventManager.subscribe("NewsPaper", new NewsPaperArchiver());

        publisher.publishMagazine(new Magazine("RevistaIT", "Marius Anca"));
        publisher.publishNewsPaper(new NewsPaper("Scinteia", "Nicolae Ceausescu"));

        System.out.println();

        //          --COMMAND--
        System.out.println("COMMAND:");
        Commander commander = new Commander();
        commander.pressHelloButton();
        commander.pressAnotherButton();
        commander.pressByeButton();

        System.out.println();

        //          --STRATEGY
        System.out.println("STRATEGY:");
        Strategy addStrategy = new AddStrategy();
        Strategy divideStrategy = new DivideStrategy();
        Strategy subStrategy = new SubStrategy();
        Strategy multiplyStrategy = new MultiplyStrategy();

        Calculator calculator = new Calculator(addStrategy);
        System.out.println(calculator.execute(10, 2));
        calculator.setStrategy(subStrategy);
        System.out.println(calculator.execute(10, 2));
        calculator.setStrategy(multiplyStrategy);
        System.out.println(calculator.execute(10, 2));
        calculator.setStrategy(divideStrategy);
        System.out.println(calculator.execute(10, 2));

    }
}
