package creational;

import creational.abstract_factory.FurnitureShop;
import creational.abstract_factory.furniture.Chair;
import creational.abstract_factory.furniture.Table;
import creational.builder.Chef;
import creational.builder.builders.ShawarmaBuilder;
import creational.builder.shawarmas.Sauce;
import creational.builder.shawarmas.Shawarma;
import creational.builder.shawarmas.Vegetable;
import creational.factory.ComputerFactory;
import creational.factory.computer.Computer;

import java.util.Objects;

public class MainC {
    public static void main(String[] args) {

        //          --BUILDER--
        System.out.println("BUILDER:");
        Chef chef = new Chef();
        ShawarmaBuilder shawarmaBuilder = new ShawarmaBuilder();
        chef.makeClassicShawarma();
        chef.makeShawarmaWithEverything();
        chef.makeVegetarianShawarma();

        Shawarma customShawarma = shawarmaBuilder
                .withKebab(true)
                .withFries(true)
                .addSauce(Sauce.GARLIC_MAYO)
                .addSauce(Sauce.BEETROOT)
                .addSauce(Sauce.CHEESE)
                .addVegetable(Vegetable.TOMATOES)
                .addVegetable(Vegetable.CORN)
                .addVegetable(Vegetable.PICKLES)
                .build();
        System.out.println("\n");

        //          --FACTORY--
        System.out.println("FACTORY:");
        Computer hp = Objects.requireNonNull(ComputerFactory.getComputer("HP"));
        System.out.println(hp.getName() + ": " + hp.getSpecs());

        Computer asus = Objects.requireNonNull(ComputerFactory.getComputer("Asus"));
        System.out.println(asus.getName() + ": " + asus.getSpecs());
        System.out.println("\n");

        //          --ABSTRACT FACTORY--
        System.out.println("ABSTRACT FACTORY:");
        FurnitureShop ikea = new FurnitureShop("Victorian");
        Chair niceChair = ikea.sellChair();
        niceChair.sitOn();

        ikea.setConfiguration("Modern");
        Table modernTable = ikea.sellTable();
        modernTable.wipeTable();
    }
}
