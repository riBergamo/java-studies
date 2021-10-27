package com.company;

public class Aula2 {
    public static void main(String[] args) {
        System.out.println(" Caneta UM");
        Aula2_caneta c1 = new Aula2_caneta();
        c1.modelo = "Bic";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.carga = 70;
        c1.status();
        c1.rabiscar();
        System.out.println(" Caneta DOIS");
        Aula2_caneta c2 = new Aula2_caneta();
        c2.cor = "Vermelho";
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
}
