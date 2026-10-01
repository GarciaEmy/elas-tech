package org.example.aula3;

public class Exercicio01 {

    static void main(String[] args) {


        double nota1 = 8;
        double nota2 = 6;
        double nota3 = 10;
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("a media dessas três notas é" + media);

        // 4 - a + b * c
        int valorA = 3;
        int valorB = 4;
        int valorC = 5;

        double resultadoFinal = valorA + valorB * valorC;

        System.out.println("O resultado de a + b * c é " + resultadoFinal);


        // 5 - (a + b) * c
        double resultadoFinal2 = (valorA + valorB) * valorC;

        System.out.println("O resultado de (a + b) * c é " + resultadoFinal2);
    }
}
