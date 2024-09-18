//Altere o tipo das duas variáveis do exercício 1 para ponto flutuante.

import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        
        float x, y, soma, sub, mult, div;
        
        System.out.print("X = ");
        x = teclado.nextFloat();
        
        System.out.print("Y = ");
        y = teclado.nextFloat();
       
        soma = x + y;
        sub = x - y;
        mult = x * y;
        div = x / y;

        System.out.printf("Soma = %.2f\n", soma);
        System.out.printf("Subtração = %.2f\n", sub);
        System.out.printf("Multiplicação = %.2f\n", mult);
        System.out.printf("Divisão = %.2f\n", div);
    }
}