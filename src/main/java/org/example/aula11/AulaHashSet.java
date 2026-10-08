package org.example.aula11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AulaHashSet {

    static void main(String[] args) {

        /*
        .add("Ana"); adiciona no final da fila
        .peek(); - Ver o primeira posição (sem remover)
        .poll(); - remove e retorna o primeiro da fila
        .isEmpty(); verifica se a fila está vaiza (true/false)
        .size(); retorna a quantidade de elementos na fila
        .contains("Bia"); procura se o elemente está na fila (true/false)
        .addAll(List.of("Ana","Bia")); adiciona varios elementos ao mesmo tempo

*/

        HashSet<String> nomes = new HashSet<>();

        nomes.add("Emy");
        nomes.add("Florentina");
        nomes.add("Larissa");
        nomes.add("Emy");

        System.out.println("Conjunto de nomes: " + nomes);
        System.out.println("Tamanho: " + nomes.size());


        HashSet<String> cores = new HashSet<>();

        cores.addAll(List.of("Amarelo" , "Azul", "Branco" , "Preto"));

        if (cores.contains("Verde")) {
            System.out.println("A cor verde já está no conjunto");
        } else {
            System.out.println("A cor verde NÃO está no conjunto");
        }

        ArrayList<String> nomeRepetido = new ArrayList<>();

        nomeRepetido.add("Catarina");
        nomeRepetido.add("Henrico");
        nomeRepetido.add("Graziela");
        nomeRepetido.add("Thanos");
        nomeRepetido.add("Catarina");
        nomeRepetido.add("Henrico");

        HashSet<String> semRepetir = new HashSet<>(nomeRepetido);

        System.out.println("ArrayList com repetido: " + nomeRepetido);
        System.out.println("Tamanho: " + nomeRepetido.size() );

        System.out.println("HashMap sem repetir: " + semRepetir);
        System.out.println("Tamanho: " + semRepetir);



        HashSet<String> cpf = new HashSet<>();

        cpf.add("123.456.789-10");
        cpf.add("987-654-321-01");
        cpf.add("456.789.123-22");

        System.out.println("CPFs: " + cpf);
        System.out.println("Tamanho: " + cpf.size());
        System.out.println("----------------------------------");

        cpf.remove("456.789.123-22");

        System.out.println("CPFs após remoção " + cpf);
        System.out.println("Tamanho atual: " + cpf.size());


        HashSet<String> frutas = new HashSet<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Morango");

        System.out.println("Lista de frutas: ");

        for (String cadaFruta : frutas) {
            System.out.println(cadaFruta);
        }


        HashSet <String> dados= new HashSet<>();

        System.out.println("O conjunto está vazio? " + dados.isEmpty());

        dados.add("Informação");

        System.out.println("O conjunto está vazio? " + dados.isEmpty());







    }
}




