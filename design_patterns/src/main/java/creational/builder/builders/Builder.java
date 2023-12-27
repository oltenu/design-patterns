package creational.builder.builders;

import creational.builder.shawarmas.Sauce;
import creational.builder.shawarmas.Shawarma;
import creational.builder.shawarmas.Vegetable;

public interface Builder {
    void reset();
    Builder addSauce(Sauce sauce);
    Builder addVegetable(Vegetable vegetable);
    Builder withKebab(Boolean kebab);
    Builder withFries(Boolean fries);
    Shawarma build();
}
