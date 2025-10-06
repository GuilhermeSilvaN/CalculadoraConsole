package entities;

import service.Operation;

public class Multiplicacao implements Operation {

    @Override
    public double execute(double a, double b) {
        return a * b;
    }
    
}
