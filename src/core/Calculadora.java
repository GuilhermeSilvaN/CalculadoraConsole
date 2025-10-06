package core;

import java.util.HashMap;
import java.util.Map;

import entities.*;
import service.Operation;

public class Calculadora {
    private final Map<Character, Operation> operations = new HashMap<>();

    public Calculadora(){
        //Dependencias injetadas no constructor (Inversao de Dependencias);
        operations.put('+', new Adicao());
        operations.put('-', new Subtracao());
        operations.put('*', new Multiplicacao());
        operations.put('/', new Divisao());
    }
    
    public double calculo(char operador, double a, double b){
        Operation op = operations.get(operador);
        if(op == null){
            throw new IllegalArgumentException("Operador invalido!");
        }

        return op.execute(a, b);
    }
}
