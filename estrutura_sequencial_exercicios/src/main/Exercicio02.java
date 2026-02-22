package estrutura_sequencial_exercicios.src.main;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        double raio = sc.nextDouble();
        System.out.printf("A=%.4f\n", PI*raio*raio);
        sc.close();
    }
}
