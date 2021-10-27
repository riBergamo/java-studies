package com.company;

import java.util.Arrays;

public class Aula14_forInt {
    public static void main(String[] args) {
        int n[] = {4, 3, 2, 1};
        Arrays.sort(n);
        for (int i : n) {
            System.out.println(i);
        }
        int posicao = Arrays.binarySearch(n, 2);
        System.out.println("Chave encontrada na posiça " + posicao);
        //int n[] = new int[10];
        //Arrays.fill(n, 1);
        //for (int i : n) {
        //    System.out.println(i);
        //}
    }
}
