package com.company;

public class Aula8_2 {
    public static void main(String[] args) {
        String nome1 = "João";
        String nome2 = "João";
        String nome3 = new String ("João");
        String res;
        res = (nome1==nome3)?"Igual":"Diferente";
        System.out.println(res);
    }
}
