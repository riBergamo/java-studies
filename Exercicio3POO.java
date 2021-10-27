package com.company;
//atributo estado;
public class Exercicio3POO {
    String marca;
    String modelo;
    int ano;
    String combustivel;

    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Combustível: " + this.combustivel);
    }

    void andar() {
        System.out.println(" Andando");
    }

    void parar() {
        System.out.println(" Parando");
    }

    void buzinar() {
        System.out.println("Bip bip");
    }

    void acelerar() {
        System.out.println(" Vruum muito rápido");
    }

    void desacelerar() {
        System.out.println(" Desacelerando");
    }

    void chamarNaSeta() {
        System.out.println(" Chamando na seta B)");
    }

    void darSeta() {
        System.out.println(" Seta ligada");
    }
}
