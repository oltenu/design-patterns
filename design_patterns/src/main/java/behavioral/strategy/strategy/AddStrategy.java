package behavioral.strategy.strategy;

public class AddStrategy implements Strategy{
    @Override
    public float execute(int a, int b) {
        return a + b;
    }
}
