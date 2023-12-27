package behavioral.strategy.strategy;

public class SubStrategy implements Strategy{
    @Override
    public float execute(int a, int b) {
        return a - b;
    }
}
