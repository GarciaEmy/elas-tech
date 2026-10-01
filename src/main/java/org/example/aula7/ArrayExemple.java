package org.example.aula7;

public class ArrayExemple {

    static void main(String[] args) {

        int[] notas = {4, 5, 7, 9, 10, 12, 88, 4};
        int[] outrasNotas = new int[3]; // ELE MOSTRA A POSIÇÃO 3

        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);

        for (int i = 0; i <= notas.length; i++) {
            System.out.println(notas[i]);


        }

    }

}

