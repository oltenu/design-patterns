package creational.factory.computer;

public class Asus implements Computer{
    @Override
    public String getSpecs() {
        return "Intel core I5 2.5GHz, 16GB RAM";
    }

    @Override
    public String getName() {
        return "Asus";
    }
}
