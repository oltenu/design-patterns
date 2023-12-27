package creational.builder;

import creational.builder.builders.ShawarmaBuilder;
import creational.builder.shawarmas.Sauce;
import creational.builder.shawarmas.Shawarma;
import creational.builder.shawarmas.Vegetable;

public class Chef {
    ShawarmaBuilder shawarmaBuilder;

    public Chef(){
        this.shawarmaBuilder = new ShawarmaBuilder();
    }

    public Shawarma makeClassicShawarma(){
        System.out.println("This is your classic Shawarma!");

        return shawarmaBuilder
                .withKebab(true)
                .withFries(true)
                .addSauce(Sauce.GARLIC_MAYO)
                .addSauce(Sauce.CHEESE)
                .addVegetable(Vegetable.TOMATOES)
                .addVegetable(Vegetable.SALAD)
                .addVegetable(Vegetable.PICKLES)
                .build();
    }

    public Shawarma makeVegetarianShawarma(){
        System.out.println("This is your vegetarian Shawarma!");

        return shawarmaBuilder
                .withKebab(false)
                .withFries(true)
                .addSauce(Sauce.BEETROOT)
                .addSauce(Sauce.OLIVES)
                .addVegetable(Vegetable.CABBAGE)
                .addVegetable(Vegetable.SALAD)
                .addVegetable(Vegetable.TOMATOES)
                .addVegetable(Vegetable.CORN)
                .build();
    }

    public Shawarma makeShawarmaWithEverything(){
        System.out.println("This is your with everything Shawarma!");

        return shawarmaBuilder
                .withKebab(true)
                .withFries(true)
                .addVegetable(Vegetable.CARROT)
                .addVegetable(Vegetable.PICKLES)
                .addVegetable(Vegetable.CORN)
                .addVegetable(Vegetable.CABBAGE)
                .addVegetable(Vegetable.ONION)
                .addVegetable(Vegetable.CUCUMBER)
                .addVegetable(Vegetable.TOMATOES)
                .addVegetable(Vegetable.BEETROOT)
                .addVegetable(Vegetable.SALAD)
                .addSauce(Sauce.OLIVES)
                .addSauce(Sauce.GARLIC)
                .addSauce(Sauce.BEETROOT)
                .addSauce(Sauce.GARLIC_MAYO)
                .addSauce(Sauce.KETCHUP)
                .addSauce(Sauce.MAYONNAISE)
                .addSauce(Sauce.CHEESE)
                .addSauce(Sauce.SPICY)
                .build();

    }
}
