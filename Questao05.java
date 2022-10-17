package Atividades01;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite valor da conta: R$");
        float valorConta = ler.nextFloat();
        System.out.println("Digite numero de pagantes");
        int numeroPagantes = ler.nextInt();
        ler.close();
        float valorDividido = valorConta / numeroPagantes;
        System.out.println("Valor da conta: R$" + valorConta);
        System.out.println("Quantidade de pessoas pagantes: " + numeroPagantes);
        System.out.println("Valor por pessoa: R$" + valorDividido);

    }
}
