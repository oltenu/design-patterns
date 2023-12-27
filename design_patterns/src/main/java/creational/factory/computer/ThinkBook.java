package creational.factory.computer;

public class ThinkBook implements Computer{
    @Override
    public String getSpecs() {
        return "Intel I3 1.6GHz, 4GB RAM";
    }

    @Override
    public String getName() {
        return "ThinkBook";
    }
}
