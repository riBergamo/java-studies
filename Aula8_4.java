package com.company;

import java.util.Scanner;

public class Aula8_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade;
        System.out.println("Idade: ");
        idade = ler.nextInt();
        String a = (16 >= idade) && (idade < 18) || (idade > 70)?"Voto Opcional!":"Voto Obrigatório!";
        System.out.println(a);
    }
}
