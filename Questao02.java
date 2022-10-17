package Atividades01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = ler.nextInt();
        ler.close();
        int numeroAnterior = --numero;
        int numeroPosterior = ++numero + 1;
        System.out.println((" numeroAnterior " + numeroAnterior ) + " " + numero + ( " numeroPosterior " + numeroPosterior));

    }
}
