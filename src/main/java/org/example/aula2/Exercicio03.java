package org.example.aula2;

public class Exercicio03 {

    static void main(String[] args) {

        // caso 1: a = 10 e b = 3
        int a = 10;
        int b = 3;

        System.out.println("Caso 1: a = b = 3");
        System.out.println("São iguais?" + (a == b));
        System.out.println("São diferentes?" + (a != b));
        System.out.println("A primeira é maior?" + (a > b));
        System.out.println("A primeira é menor?" + (a < b));

        System.out.println();

        // caso 2: a = 3 e b = 10
        int numeroA = 3;
        int numeroB = 10;

        System.out.println("Caso 2: a = 3 e b = 10");
        System.out.println("São iguais? " + (numeroA == numeroB));
        System.out.println("São diferentes " + (numeroA != numeroB));
        System.out.println("A primeira é maior? " + (numeroA > numeroB));
        System.out.println("A primeira é menor? " + (numeroA < numeroB));

        System.out.println();

        //caso 3: a = 5 e b = 5
        a = 5;
        b = 5;

        System.out.println("Caso 3: a = 5 e b = 5");
        System.out.println("São iguais? " + (a == b));
        System.out.println("São diferentes? " + (a != b));
        System.out.println("A primeira é maior? " + (a > b));
        System.out.println("A primeira é menor? " + (a < b));

        System.out.println();

        a = 10;
        b = 3;

        System.out.println("Resultado: " + (a == b));

        System.out.println();

        a = 10;
        b = 3;
        a = b;

        System.out.println("Resultado de a + b");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b" + b);

        boolean estaChovendo = true;
        System.out.println(!estaChovendo);










    }




}
