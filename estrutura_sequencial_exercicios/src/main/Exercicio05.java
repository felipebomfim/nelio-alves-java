package estrutura_sequencial_exercicios.src.main;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valueToPay = 0;
        for (int i = 0; i < 2; i++) {
            sc.nextInt();
            int numOfClothing = sc.nextInt();
            double unitaryValue = sc.nextDouble();
            valueToPay+=numOfClothing*unitaryValue;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",valueToPay);
        sc.close();
    }

}
