package com.company;

//69) [DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de uma
//PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
//a soma entre todos os valores da sequência.
//an(ultimotermo) = primeiroTermo + (n - 1) * razao;

import java.util.Scanner;

public class Exercicio69pa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantTermo = 9, primeiroTermo;
        float razao, ultimoTermo;
        System.out.println("Primeiro termo da PA: ");
        primeiroTermo = ler.nextInt();
        System.out.println("Razão da PA: ");
        razao = ler.nextFloat();
        ultimoTermo = primeiroTermo + ((quantTermo - 1) * razao);
        System.out.println("Último Termo: " + ultimoTermo);
        for (int i = 1; i <= quantTermo; i++) {
            System.out.println(" (" + i + ") " + primeiroTermo);
            primeiroTermo += razao;
        }
    }
}
