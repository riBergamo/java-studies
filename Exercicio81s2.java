package com.company;

//81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
//final, mostre:
//a) Qual é a média de idade das pessoas cadastradas
//b) Em quais posições temos pessoas com mais de 25 anos
//c) Qual foi a maior idade digitada
//d) Em que posições digitamos a maior idade

import java.util.Scanner;

public class Exercicio81s2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idades[] = new int[8];
        int maior = 0;
        int posicaoMaiorIdade = 0;
        int soma = 0;
        for (int i = 0; i < idades.length; i++) {
            System.out.println(i + ". Idade : ");
            idades[i] = ler.nextInt();
            soma += idades[i];
            if (maior < idades[i]) {
                maior = idades[i];
                posicaoMaiorIdade = i;
            }
        }
        System.out.println("Posiçoes das pessoas com mais de 25 anos: ");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 25) {
                System.out.println(i);
            }
        }
        float media = soma/8;
        System.out.println("Média das idades digitadas: " + media);
        System.out.println("Posição maior idade: " + posicaoMaiorIdade);
    }
}
