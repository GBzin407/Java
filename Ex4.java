//Leia o raio de um círculo. Em seguida imprima operímetro (2R) e a área (R2) do círculo com esse raio.

import java.util.Scanner;

public class Ex4{
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        final float PI = 3.14f;

        float raio, perimetro, area;

        System.out.println("Raio: ");
        raio = teclado.nextFloat();

        perimetro = 2 * PI * raio;
        area = PI * raio * raio;

        System.out.printf("Perímetro = %.2f\n", perimetro);
        System.out.printf("Area = %.2f\n", area);


    }
}