package core;

import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public double readNumber(String msg){
        while (true){
            try{
                System.out.print(msg);
                return Double.parseDouble(scanner.nextLine());
            } catch(NumberFormatException e){
                System.out.println("Numero invalido, tente novamente.");
            }
        }
    }

    public char readOperador(){
        System.out.println("Digite o operador (+, -, *, /): ");
        return scanner.nextLine().charAt(0);
    }
}
