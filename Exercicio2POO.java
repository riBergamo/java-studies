package com.company;

public class Exercicio2POO {
    String materia;
    String tempo;
    int exercicios;

    void status() {
        System.out.println("Aula: " + this.materia);
        System.out.println("tempo aproximado: " + this.tempo + "H.");
        System.out.println("Quantidade de exercícios: " + this.exercicios);
    }

    void comecar() {
        System.out.println("Começando...");
    }

    void terminar() {
        System.out.println("Fim dos estudos.");
    }

    void cancelar() {
        System.out.println("Cancelado.");
    }
}
