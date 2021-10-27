package com.company;

public class Aula14_arrayMeses {
    public static void main(String[] args) {
        String mes[] = {"janeiro", "fevereiro", "março", "abril"};
        int dias[] = {31, 28, 31, 30};
        for (int i = 0; i < dias.length; i++) {
            System.out.println("O mês de " + mes[i] + " tem " + dias[i] + " dias.");
        }
    }
}
