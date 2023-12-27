package creational.abstract_factory.factory;

import creational.abstract_factory.furniture.Chair;
import creational.abstract_factory.furniture.Table;
import creational.abstract_factory.furniture.VictorianChair;
import creational.abstract_factory.furniture.VictorianTable;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
