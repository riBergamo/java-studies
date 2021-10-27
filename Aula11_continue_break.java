package com.company;

public class Aula11_continue_break {
    public static void main(String[] args) {
        System.out.println("while com Continue.");
        int x = 1;
        while (x <= 10) {
            x++;
            if (x == 5) {
                continue;
            }
            System.out.println(x);
        }
        System.out.println("while com break.");
        int i = 1;
        while (i <= 10) {
            i++;
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
    }
}
