package com.company;

import java.util.Scanner;

public class Exercicio38_for_while_41 {
    public static void main(String[] args) {
        System.out.println(" Contagem com for(Para).");
        for (int i = 6; i <= 11; i++) {
            System.out.println(i);
        }
        System.out.println(" Contagem com while(Enquanto).");
        int x = 1;
        while (x <= 10) {
            x++;
            if (x == 5) {
                continue;
            }
            System.out.println(x);
        }
        System.out.println("Do maior para o menor (for).");
        for (int y = 10; y >= 1; y--) {
            System.out.println(y);
        }
        System.out.println("Pulando de três em três (for).");
        for (int z = 1; z <= 20; z = z + 3) {
            System.out.println(z);
        }
        for (int w = 100; w >= 0; w = w - 5) {
            System.out.println(w);
        }
        System.out.println(" Acabou ! ");
    }
}
