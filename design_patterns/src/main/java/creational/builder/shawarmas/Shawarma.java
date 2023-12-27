package creational.builder.shawarmas;

import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Shawarma {
    private final List<Sauce> sauces;
    private final List<Vegetable> vegetables;
    private Boolean kebab;
    private Boolean fries;

    public Shawarma(){
        sauces = new ArrayList<>();
        vegetables = new ArrayList<>();
        kebab = false;
        fries = false;
    }

    public void addSauce(Sauce sauce){
        sauces.add(sauce);
    }

    public void addVegetable(Vegetable vegetable){
        vegetables.add(vegetable);
    }

    public void setKebab(Boolean kebab) {
        this.kebab = kebab;
    }

    public void setFries(Boolean fries) {
        this.fries = fries;
    }
}
