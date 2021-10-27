package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercicio32sorteioInt {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();
        int aleatorio = random.nextInt(5);
        System.out.println(" Descubra o número sorteado : ");
        int res = ler.nextInt();
        String res2 = (res != aleatorio)?"ERROU!":"Parabéns!";
        System.out.println(res2);
        System.out.println(aleatorio);
    }
}
