package creational.abstract_factory;

import creational.abstract_factory.factory.FurnitureFactory;
import creational.abstract_factory.factory.ModernFurnitureFactory;
import creational.abstract_factory.factory.VictorianFurnitureFactory;
import creational.abstract_factory.furniture.Chair;
import creational.abstract_factory.furniture.Table;

public class FurnitureShop {
    private String configuration;
    private FurnitureFactory factory;

    public FurnitureShop(String configuration){
        this.configuration = configuration;
        setFactory();
    }

    public Chair sellChair(){
        return factory.createChair();
    }

    public Table sellTable(){
        return factory.createTable();
    }

    private void setFactory(){
        if(configuration.equals("Victorian"))
            factory = new VictorianFurnitureFactory();
        else if(configuration.equals("Modern"))
            factory = new ModernFurnitureFactory();
        else
            System.out.println("Invalid configuration!");
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
        setFactory();
    }
}
