package behavioral.command;

import behavioral.command.command.*;

public class Commander {
    private final Button helloButton;
    private final Button byeButton;
    private final Button anotherButton;
    private final PrintHelloCommand helloCommand;
    private final PrintByeCommand byeCommand;
    private final AnotherCommand anotherCommand;

    public Commander(){
        helloButton = new Button("Hello Button");
        byeButton = new Button("Bye Button");
        anotherButton = new Button("Another Button");
        helloCommand = new PrintHelloCommand();
        byeCommand = new PrintByeCommand();
        anotherCommand = new AnotherCommand();
    }

    public void pressHelloButton(){
        helloButton.pressButton();
        helloCommand.execute();
    }

    public void pressByeButton(){
        byeButton.pressButton();
        byeCommand.execute();
    }

    public void pressAnotherButton(){
        anotherButton.pressButton();
        anotherCommand.execute();
    }
}
