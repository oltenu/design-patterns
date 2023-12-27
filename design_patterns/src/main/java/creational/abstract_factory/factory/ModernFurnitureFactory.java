package creational.abstract_factory.factory;

import creational.abstract_factory.furniture.Chair;
import creational.abstract_factory.furniture.ModernChair;
import creational.abstract_factory.furniture.ModernTable;
import creational.abstract_factory.furniture.Table;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
