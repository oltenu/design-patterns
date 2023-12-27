package creational.builder.shawarmas;

import lombok.Getter;

@Getter
public enum Vegetable {
    TOMATOES("Tomatoes"),
    SALAD("Salad"),
    PICKLES("Pickles"),
    CUCUMBER("Cucumber"),
    CORN("Corn"),
    BEETROOT("Beetroot"),
    ONION("Onion"),
    CABBAGE("Cabbage"),
    CARROT("Carrot"),
    NOTHING("Nothing");

    private final String vegetableName;

    Vegetable(String vegetableName){
        this.vegetableName = vegetableName;
    }
}
