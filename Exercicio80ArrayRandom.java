package com.company;

//80) Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
//15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
//número (chave) e seu programa deve mostrar em que posições essa chave foi
//encontrada. Mostre também quantas vezes a chave foi sorteada.

import java.util.Random;
import java.util.Scanner;

public class Exercicio80ArrayRandom {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();
        int vet[] = new int[10];
        int posicaoChave = 0;
        System.out.println("Chave: ");
        int chave = ler.nextInt();
        for (int i = 0; i < vet.length; i++) {
            int aleatorio = rand.nextInt(10);
            vet[i] = aleatorio;
            System.out.println("(" + i + ") " + vet[i]);
            if (chave == vet[i]) {
                posicaoChave = i;
            }
        }
        System.out.println("Posiçao da chave digitada : " + posicaoChave);
    }
}
