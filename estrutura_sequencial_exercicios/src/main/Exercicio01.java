package estrutura_sequencial_exercicios.src.main;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2;
        x1 = sc.nextInt();
        x2 = sc.nextInt();

        System.out.printf("SOMA = %d\n", x1 + x2);

        sc.close();
    }

}
