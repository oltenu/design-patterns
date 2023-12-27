package creational.abstract_factory.factory;

import creational.abstract_factory.furniture.Chair;
import creational.abstract_factory.furniture.Table;

public interface FurnitureFactory {
    Chair createChair();
    Table createTable();
}
