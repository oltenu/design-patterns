package creational.builder.shawarmas;

import lombok.Getter;

@Getter
public enum Sauce {
    GARLIC("Garlic"),
    MAYONNAISE("Mayonnaise"),
    GARLIC_MAYO("GarlicMayo"),
    BEETROOT("Beetroot"),
    KETCHUP("Ketchup"),
    SPICY("Spicy"),
    CHEESE("Cheese"),
    OLIVES("Olives"),
    NOTHING("Nothing");

    private final String sauceName;

    Sauce(String sauceName){
        this.sauceName = sauceName;
    }
}
