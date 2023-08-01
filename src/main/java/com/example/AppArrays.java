package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("### Arrays JAVA ###");
        System.out.println();

        int vetorInt[] = {10, 20, 30, 40};
        double vetorDouble[] = {50, 60, 70, 80};
        
        System.out.println(Arrays.toString(vetorInt));
        System.out.println("Vetor Int - Posição 1: " + vetorInt[0]);
        System.out.println("Vetor Int - Posição 2: " + vetorInt[1]);
        System.out.println("Vetor Int - Posição 3: " + vetorInt[2]);
        System.out.println("Vetor Int - Posição 3: " + vetorInt[3]);
        
        System.out.println();
        System.out.println(Arrays.toString(vetorDouble));
        System.out.println("Vetor Double - Posição 1: " + vetorDouble[0]);
        System.out.println("Vetor Double - Posição 2: " + vetorDouble[1]);
        System.out.println("Vetor Double - Posição 3: " + vetorDouble[2]);
        System.out.println("Vetor Double - Posição 3: " + vetorDouble[3]);

        // Cria um array vazio apenas reservando os espaços e
        // Incluir os valores posteriormente.
        System.out.println();
        int vetorInt2[] = new int [4];
        vetorInt2[0] = 100;
        vetorInt2[1] = 110;
        vetorInt2[2] = 120;
        vetorInt2[3] = 130;
        System.out.println(Arrays.toString(vetorInt2));
        System.out.println("Vetor Double - Posição 1: " + vetorInt2[0]);
        System.out.println("Vetor Double - Posição 2: " + vetorInt2[1]);
        System.out.println("Vetor Double - Posição 3: " + vetorInt2[2]);
        System.out.println("Vetor Double - Posição 3: " + vetorInt2[3]);

        System.out.println();

    }
}
