package com.company;

public class Aula15metodoFuncao {
    static int soma (int a, int b) {
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        int recebeFuncao = soma(5, 2);
        System.out.println(recebeFuncao);
    }
}
