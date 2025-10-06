package entities;

import service.Operation;

public class Adicao implements Operation{
    @Override
    public double execute(double a, double b){
        return a + b;
    }
}
