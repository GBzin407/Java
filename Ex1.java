//Leia duas variáveis inteiras e imprima a soma, subtração, multiplicação e divisão entre elas.

import java.util.Scanner;

public class Ex1{
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x, y;

        System.out.print("X = ");
        x = teclado.nextInt();
        System.out.print("Y = ");
        y = teclado.nextInt();

        int soma, sub, mult, div;
        soma = x + y;
        sub = x - y;
        mult = x * y;
        div = x / y;

        System.out.printf("Soma = %d\n", soma);
        System.out.printf("Subtração = %d\n", sub);
        System.out.printf("Multiplicação = %d\n", mult);
        System.out.printf("Divisão = %d\n", div);
    }
}