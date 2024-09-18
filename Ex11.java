//Ler um caractere op representando uma operação aritmética (+, -, *, /) e em seguida dois números reais a e b. Imprimir a expressão matemática junto com o seu resultado no formato: a op b = resultado

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        
        // Ler o caractere representando a operação
        System.out.print("Digite a operação (+, -, *, /): ");
        char op = teclado.next().charAt(0);
        
        // Ler os dois números reais
        System.out.print("Digite o primeiro número: ");
        double a = teclado.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double b = teclado.nextDouble();
        
        double resultado;
        boolean valido = true;
        
        // Calcular o resultado com base na operação
        switch (op) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: Divisão por zero.");
                    valido = false;
                    resultado = Double.NaN; // Não é um número
                }
                break;
            default:
                System.out.println("Operação inválida.");
                valido = false;
                resultado = Double.NaN;
                break;
        }
        
        // Imprimir o resultado se a operação for válida
        if (valido) {
            System.out.printf("%.2f %c %.2f = %.2f%n", a, op, b, resultado);
        }
        
        teclado.close();
    }
}