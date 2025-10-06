package entities;

import service.Operation;

public class Subtracao implements Operation {

    @Override
    public double execute(double a, double b) {
        
        return a - b;
    }
    
}