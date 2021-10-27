package com.company;

public class Exercicio1POO {
    boolean tampada;
    int cheia;
    int tamanho;
    String tipo;

    void status() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Cheia: " + this.cheia + "%");
        System.out.println("Tamanho: " + this.tamanho + "ml");
    }

    void amassar() {
        if (this.tipo == ("lata")) {
            System.out.println("latinha amassada.");
        }
    }

    void beber() {
        if (this.tampada == true) {
            System.out.println("Destampe antes de beber.");
        } else {
            System.out.println("Bebendo...");
        }
    }

    void encher() {
        if (this.tampada == true || cheia == 100) {
            System.out.println("Não pode encher, destampe ou beba a água.");
        } else {
            System.out.println("Enchendo...");
        }
    }

    void fechar() {
        if (this.tampada == false) {
            this.tampada = true;
        }
    }

    void abrir() {
        if (this.tampada == true) {
            this.tampada = false;
        }
    }
}

