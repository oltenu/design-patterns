package creational.factory;

import creational.factory.computer.*;

public class ComputerFactory {
    public static Computer getComputer(String brand){
        switch (brand){
            case "Asus" -> {
                return new Asus();
            }
            case "HP" -> {
                return new HP();
            }
            case "ThinkBook" -> {
                return new ThinkBook();
            }
            case "MacBook" -> {
                return new Macbook();
            }
        }
        System.out.println("Invalid Brand!");

        return null;
    }
}
