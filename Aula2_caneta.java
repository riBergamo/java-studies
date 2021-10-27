package com.company;

public class Aula2_caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Modelo: " + this.modelo); //this é substituido pelo objeto (c1).
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "% ");
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro!");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
