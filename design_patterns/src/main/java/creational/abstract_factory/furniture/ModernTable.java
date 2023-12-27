package creational.abstract_factory.furniture;

public class ModernTable implements Table{
    @Override
    public void wipeTable() {
        System.out.println("The modern table is now clean.");
    }
}
