//Leia uma variável t com um tempo qualquer em segundos e imprima esse valor em hora, minuto e segundo.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int t, h, m, s;

        System.out.print("Digite o tempo: ");
        t = teclado.nextInt();

        h = t / 3600;
        m = (t % 3600) / 60;
        s = t % 60;

        System.out.printf("Horas: %d\n", h);
        System.out.printf("Minutos: %d\n", m);
        System.out.printf("Segunfos: %d\n", s);
    }
}