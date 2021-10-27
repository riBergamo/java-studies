package com.company;

import java.util.Scanner;

public class Aula10_2_casos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int pernas;
        String tipo;
        System.out.println(" Quantidade de pernas: ");
        pernas = ler.nextInt();
        System.out.print(" É um(a) ");
        switch (pernas) {
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "E.T";
                break;
        }
        System.out.println(tipo);
    }
}
