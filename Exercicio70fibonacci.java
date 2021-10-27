package com.company;

//70) [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência
//de Fibonacci:
//1 1 2 3 5 8 13 21...

public class Exercicio70fibonacci {
    public static void main(String[] args) {
        int A = 0;
        int B = 1;
        int C;
        for (int i = 1; i <= 10; i++) {
            System.out.println(B);
            C = B;
            B += A;
            A = C;
        }
    }
}
