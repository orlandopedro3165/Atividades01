package Atividades01;

import java.util.Scanner;

public class Questao00 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        ler.close();
        System.out.println(" Olá:" + nome);
    }
}
