package org.example.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AulaArrayList {

    // COLLECTIONS É O CONJUNTO DE ESTRUTURA DO JAVA PRA GUARDAR VARIOS VALORES - ELAS CRESCEM E DIMINUEM SOZINHAS
    // LIST - É UM TIPO DE INTERFACE - RECEBE UMA SEQUENCIA
    // ARRAY - TEM UM TAMANHO FIXO

    /*.add();
        nomes.add("Carla");          // adiciona no fim
        nomes.get(0);                // pega pela posição
        nomes.size();                // quantos tem
        nomes.set(0, "Zoe");         // troca o valor da posição
        nomes.remove(1);             // remove pela posição
        nomes.contains("Ana");       // true ou false
        nomes.indexOf("Bia");        // em que posição está
        nomes.isEmpty();             // true se está vazia


     */
    static void main(String[] args) {


        ArrayList<Integer> lista = new ArrayList<>();
        //System.out.println(lista.isEmpty());
        lista.add(1);
        lista.add(10);
        lista.add(100);
        lista.add(1000);

        lista.add(2,77);
        System.out.println(lista);

        lista.addAll(List.of(1,2,35,6,765,234,9));

        System.out.println(lista);
        lista.remove(1);
        lista.remove(3);
        System.out.println(lista);
        System.out.println(lista.get(2));

        lista.set(1,98);
        System.out.println(lista);
        System.out.println(lista.size());

        System.out.println(lista.contains(98));
        System.out.println(lista.indexOf(98));
        System.out.println(lista.isEmpty());

    }

    }

