package behavioral.command;

public class Button {
    private final String buttonName;

    public Button(String buttonName){
        this.buttonName = buttonName;
    }

    public String getButtonName(){
        return buttonName;
    }

    public void pressButton(){
        System.out.println("Button: " + buttonName + " is pressed.");
    }
}
