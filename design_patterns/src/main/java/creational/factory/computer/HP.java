package creational.factory.computer;

public class HP implements Computer{
    @Override
    public String getSpecs() {
        return "AMD Ryzen 5 3GHz, 8GB RAM";
    }

    @Override
    public String getName() {
        return "HP";
    }
}
