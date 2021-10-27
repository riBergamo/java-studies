package com.company;

public class Exercicio1POO_2 {
    public static void main(String[] args) {
        Exercicio1POO g1 = new Exercicio1POO();
        g1.tipo = "Garrafa de água";
        g1.tampada = true;
        g1.cheia = 40;
        g1.tamanho = 500;
        g1.status();
        g1.abrir();
        g1.beber();
        g1.encher();
    }
}
