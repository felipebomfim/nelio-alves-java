package estrutura_sequencial_exercicios.src.main;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }

        final int diferenca = arr[0]*arr[1] - arr[2]*arr[3];
        System.out.println("DIFERENCA = "+diferenca);

        sc.close();
    }
}
