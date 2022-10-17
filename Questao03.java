package Atividades01;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite nota um: ");
        int nota1 = ler.nextInt();
        System.out.println("Digite nota dois: ");
        int nota2 = ler.nextInt();
        ler.close();
        double media = 0;
        media = (nota1 + nota2) / 2;
        if(media >= 7) {
            System.out.println(" Aprovado.");
            
        } else {
            System.out.println(" Reprovado.");
        }
        
    }
}
