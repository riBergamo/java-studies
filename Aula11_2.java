package com.company;

import java.util.Scanner;

public class Aula11_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int fatorial = 1;
        System.out.println(" FATORIAL ");
        System.out.println("Digite o valor: ");
        int maiorValor = ler.nextInt();
        System.out.print(maiorValor + "! : ");
        for (int i = maiorValor; i >= 1; i--) {
            fatorial *= i;
            System.out.print(i + " ");
        }
        System.out.println(" = " + fatorial);
    }
}
