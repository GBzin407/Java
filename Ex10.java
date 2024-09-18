//Ler um número inteiro n e mais dois números (inferior e superior) que formam um intervalo. Ao final, imprima uma mensagem informando se n está antes, dentro ou depois do intervalo.

import java.util.Scanner;

public class Ex10{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, inf, sup;

        System.out.print("Digite um número inteiro: ");
        n = teclado.nextInt();

        System.out.print("Digite um número inferior: ");
        inf = teclado.nextInt();

        System.out.print("Digite um número superior: ");
        sup = teclado.nextInt();

        if (n < inf){
        System.out.printf("O número está antes do intervalo.\n");
        } else if (n > sup){
            System.out.printf("O número está depois do intervalo.\n");
        } else {
            System.out.printf("O número está dentro do intervalo.\n");
        }
    }
}