package creational.builder.builders;

import creational.builder.shawarmas.*;

public class ShawarmaBuilder implements Builder{
    private Shawarma shawarma;

    public ShawarmaBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.shawarma = new Shawarma();
    }

    @Override
    public Builder addSauce(Sauce sauce) {
        shawarma.addSauce(sauce);

        return this;
    }

    @Override
    public Builder addVegetable(Vegetable vegetable) {
        shawarma.addVegetable(vegetable);

        return this;
    }

    @Override
    public Builder withKebab(Boolean kebab) {
        shawarma.setKebab(kebab);

        return this;
    }

    @Override
    public Builder withFries(Boolean fries) {
        shawarma.setFries(fries);

        return this;
    }

    @Override
    public Shawarma build() {
        return this.shawarma;
    }
}
