package Atividades01;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite valor da hora: R$ ");
        double valorHora = ler.nextDouble();
        System.out.println(" Digite quantidades de horas trabalhadas: ");
        int qndHorasTrabalhadas = ler.nextInt();
        ler.close();
        double salario = 0;
        salario = qndHorasTrabalhadas * valorHora; 
        System.out.println("O salario que " + nome + "vai receber é R$:" + salario);

    }
    
        
    
}
