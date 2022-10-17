package Atividades01;

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite valor da janta: ");
        double valorJanta = ler.nextDouble(); 
        ler.close();
        double taxaGarcon = valorJanta * 10 / 100;
        double valorFinal = valorJanta + taxaGarcon;
        System.out.println("Valor da janta: R$ " + valorJanta);
        System.out.println("Comissão 10% do garçon: R$ " + taxaGarcon);
        System.out.println("Valor final = R$ " + valorFinal);

    }
}
