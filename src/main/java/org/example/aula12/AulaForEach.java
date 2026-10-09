package org.example.aula12;

import org.example.aula7.Array;

import java.util.ArrayList;

public class AulaForEach {
    static void main(String[] args) {

            String[] nomes = {"Ana", "Carlos", "Beatriz", "Gabriel"};

            for (String nome : nomes) {
                System.out.println(nome);

            }
        }

            ArrayList<Double> notas = new ArrayList<>();

            notas.add(8.5);
            notas.add(7.0);
            notas.add(9.2);
            notas.add(6.8);
            notas.add(10.0);

            for (Double nota : notas) {
                System.out.println(nota);
            }

            double[] notas = {8, 6, 10, 7};

            double soma = 0;

            for (double nota : notas) {
                soma += nota;
            }
            double media = soma / notas.length;

            System.out.println("Soma total: " + soma);
            System.out.println("Média das notas: " + media);



        String[] nomes = {"Mariana", "Ana", "Gabriel", "Lucas", "Alexander", "Bia"};

        int cont = 0;

        for (String nome : nomes) {
            if (nome.length() > 5) {
                cont++;
            }

            System.out.println("Total de nomes com mais de 5 letras: " + cont);



        String[] nomes = {"Ana", "Carlos", "Beatriz", "Gabriel"};

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Usando For Normal ---");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Índice " + i + ": " + nomes[i]);
        }

        }
    }
