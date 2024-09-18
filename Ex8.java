//Leia duas variáveis com a quantidade de kilowatts consumidos em uma casa e o valor do kilowatt. Em seguida, calcule o valor a ser pago, concedendo um desconto de 10% caso o consumo seja menor que 150Kw.
import java.util.Scanner;

public class Ex8 {
    public static void main(){
        Scanner teclado = new Scanner (System.in);

        double quantKilowatts, valKilowatts, valor, valorDesconto;

        System.out.print("Digite a quantidade de Kilowatts consumidos: ");
        quantKilowatts = teclado.nextDouble();

        System.out.print("Digite o valow do Kilowatt: ");
        valKilowatts = teclado.nextDouble();

        valor = quantKilowatts * valKilowatts;

        if (quantKilowatts < 150){
            valorDesconto = valor * 0.90;
        } else {
            valorDesconto = valor;
        }

        System.out.printf("O valor que será pago é: %.2f\n", valorDesconto);

    }
}