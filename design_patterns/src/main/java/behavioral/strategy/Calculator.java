package behavioral.strategy;

import behavioral.strategy.strategy.Strategy;

import java.util.Stack;

public class Calculator {
    private Strategy strategy;

    public Calculator(Strategy strategy){
        this.strategy = strategy;
    }

    public float execute(int a, int b){
        return strategy.execute(a, b);
    }

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
}
