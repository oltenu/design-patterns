package creational.factory.computer;

public class Macbook implements Computer{
    @Override
    public String getSpecs() {
        return "Some processor, 16GB RAM";
    }

    @Override
    public String getName() {
        return "Macbook";
    }
}
