//Leia uma variável n inteira. Em seguida, imprima uma mensagem informando se o número n é par ou ímpar.

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);

        int n;

        System.out.print("Digite qualquer número inteiro: ");
        n = teclado.nextInt();

        if (n % 2 == 0) {
            System.out.println("O número digitado é par.");
        } else {
            System.out.println("O número digitado é ímpar");
        }
    }
}