//Leia o salário e o percentual de aumento. Em seguida, aplique o percentual de aumento sobre o salário e imprima o novo salário.

import java.util.Scanner;

public class Ex3{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario, percentual, aumento, novoSalario;

        System.out.print("Digite o salário: ");
        salario = teclado.nextDouble();
        System.out.print("Digite o percentual: ");
        percentual = teclado.nextDouble();

        aumento = salario * percentual / 100;
        novoSalario = salario + aumento;

        System.out.printf("O novo salário será: %.2f\n", novoSalario);
    }
}