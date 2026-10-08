package org.example.aula11;
import java.util.HashMap;
import java.util.Map;

public class AulaHashMap {

    static void main(String[] args) {

        Map<String, Integer> pessoas = new HashMap<>();

        pessoas.put("Mariana" , 25);
        pessoas.put("Gabriel" , 31);
        pessoas.put("Lucas" , 19);

        System.out.println("Mapa de pessoas: " + pessoas);

        int idadeGabriel = pessoas.get("Gabriel");
        System.out.println("A idade do Gabriel é: " + idadeGabriel);



        Map<String, Double> produtos = new HashMap<>();

        produtos.put("café", 5.00);

        System.out.println("Mapa inicial: " + produtos);
        System.out.println("Tamanho inicial: " + produtos.size());

        produtos.put("café", 7.50);
        System.out.println("após atualizar o preço: " + produtos);
        System.out.println("Tamanho final: " + produtos.size());



        Map<String, String> agenda = new HashMap<>();

        agenda.put("Mariana", "11 98765-4321");
        agenda.put("Gabriel", "11 91234-5678");

        String nomeBusca1 = "Mariana";
        if (agenda.containsKey(nomeBusca1)) {
            System.out.println("Telefone de " + nomeBusca1 + ": " + agenda.get(nomeBusca1));
        } else {
            System.out.println(nomeBusca1 + " não está na agenda.");
        }

        String nomeBusca2 = "Lucas";
        if (agenda.containsKey(nomeBusca2)) {
            System.out.println("Telefone de " + nomeBusca2 + ": " + agenda.get(nomeBusca2));
        } else {
            System.out.println(nomeBusca2 + " não está na agenda.");
        }


        Map<String, Integer> estoque = new HashMap<>();

        // Adiciona dois itens
        estoque.put("Caderno", 15);
        estoque.put("Caneta", 50);

        int qtdCaderno = estoque.getOrDefault("Caderno", 0);
        System.out.println("Quantidade de Cadernos (getOrDefault): " + qtdCaderno);
        int qtdBorracha = estoque.getOrDefault("Borracha", 0);
        System.out.println("Quantidade de Borrachas (getOrDefault): " + qtdBorracha);

        Integer qtdBorrachaGet = estoque.get("Borracha");
        System.out.println("Quantidade de Borrachas (get normal): " + qtdBorrachaGet);



        Map<String, Double> notas = new HashMap<>();

        notas.put("Mariana", 9.5);
        notas.put("Beatriz", 8.0);
        notas.put("Camila", 7.5);

        System.out.println("Mapa inicial: " + notas);
        System.out.println("Tamanho inicial: " + notas.size());


        notas.remove("Beatriz");
        System.out.println(" após remoção: " + notas);
        System.out.println("Tamanho atualizado: " + notas.size());
    }





    }


