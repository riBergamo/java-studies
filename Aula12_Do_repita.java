package com.company;

import java.util.Scanner;

public class Aula12_Do_repita {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //int i = 0;
        //do {
        //    i++;
        //    System.out.println(i);
        //} while (i <= 4);
        String res;
        int soma = 0, num;
        do {
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            soma += num;
            System.out.println("Quer continuar: ");
            res = ler.next();
        } while (res.equals("sim"));
        System.out.println("soma: " + soma);
    }
}
