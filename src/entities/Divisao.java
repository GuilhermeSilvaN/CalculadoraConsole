package entities;

import service.Operation;

public class Divisao implements Operation {

    @Override
    public double execute(double a, double b) {
        if (b == 0) throw new ArithmeticException("Divisao por zero!");
        return a / b;
    }
    
}