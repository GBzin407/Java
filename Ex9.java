//Ler um número real x e imprimi-lo arredondando seu valor para mais ou para menos. Se a parte decimal for menor que 0.5 arredonda para menos. Se for maior ou igual a 0.5 arredonda para mais.

import java.util.Scanner;

public class Ex9 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x;

        System.out.print("Digite um número para ser arredondado: ");
        x = teclado.nextDouble();

        long arredonda = Math.round(x);

        System.out.printf("O valor digitado será arredondado para: %d\n", arredonda);
    }
}