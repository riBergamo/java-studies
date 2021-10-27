package com.company;

import java.util.Scanner;

public class Aula8maior {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, maior;
        int n2 = 2;
        System.out.println("Digite um número: ");
        n1 = ler.nextInt();
        //? entao
        //: senao
        maior = n1>n2?n1:n2;
        System.out.println("O maior é o número: "+ maior);
    }
}
