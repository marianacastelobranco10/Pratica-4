package com.company;

public class Main {
    public static void main(String[] args) {
        Vetores arrays = new Vetores();

        for (int i = 0; i < 10; i++) {
            for (int j = 9; j > 0; j--) {
                arrays.setArrayANaPosicao(i, j);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 9; j > 0; j--) {
                arrays.setArrayBNaPosicao(i, j);
            }
        }
    }
}