//Leia a distância percorrida por um carro, o tempo gasto e a quantidade de gasolina consumida. Em seguida, imprima a velocidade média (KM/h) e o consumo de combustível (Km/l).


import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double distancia, tempo, gasolina, velMedia, consumoCombustivel;

        System.out.print("Digite a distância percorrida: ");
        distancia = teclado.nextDouble();

        System.out.print("Digite o tempo gasto na corrida: ");
        tempo = teclado.nextDouble();

        System.out.print("Digite a quantidade de gasolina gasta: ");
        gasolina = teclado.nextDouble();

        velMedia = distancia / tempo;
        consumoCombustivel = distancia / gasolina;

        System.out.printf("Velocidade média: %.2f km/h%n", velMedia);
        System.out.printf("Conbustível consumido: %.2f km/l%n", consumoCombustivel);
    }
}