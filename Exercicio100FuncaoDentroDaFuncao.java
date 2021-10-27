package com.company;

//100) Melhore o exercício 96, criando além da função Media() uma outra função
//chamada Situacao(), que vai retornar para o programa principal se o aluno está
//APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
//parâmetro o resultado retornado pela função Media().

import java.util.Scanner;

public class Exercicio100FuncaoDentroDaFuncao {
    static float media(float nota1, float nota2) {
        float soma = nota1 + nota2;
        float med = soma / 2;
        return med;
    }

    static String situ(float media) {
        if (media >= 7) {
            return " Aprovado.";
        } else if (media > 5 && media < 7) {
            return " Recuperação.";
        } else {
            return " Reprovado.";
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Nota: ");
        float n1 = ler.nextFloat();
        System.out.println("Nota: ");
        float n2 = ler.nextFloat();
        float res = media(n1, n2);
        System.out.println(res);
        String situacao = situ(res);
        System.out.println(situacao);
    }
}
