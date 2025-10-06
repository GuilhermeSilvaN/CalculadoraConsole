package app;

import core.Calculadora;
import core.InputHandler;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        InputHandler input = new InputHandler();

        System.out.println("=== Calculadora ===");

        double a = input.readNumber("Digite o primeiro numero: ");
        char operador = input.readOperador();
        double b = input.readNumber("Digite o segundo numero: ");

        try {
            double resultado = calc.calculo(operador, a, b);

            // mostra resultado formatado (sem .0 se for inteiro)
            if (resultado % 1 == 0)
                System.out.println("Resultado: " + (int) resultado);
            else
                System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }    
}
