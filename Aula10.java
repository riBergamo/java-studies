package com.company;

import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nascimento, idade;
        System.out.println("Ano de nascimento: ");
        nascimento = ler.nextInt();
        idade = 2021 - nascimento;
        if (idade < 16) {
            System.out.println("Não pode votar!");
        } else if ((idade >= 16 && idade < 18) || (idade >= 70)) {
            System.out.println("O voto é opcional!");
        } else {
            System.out.println("O voto é obrigatório!");
        }
    }
}
