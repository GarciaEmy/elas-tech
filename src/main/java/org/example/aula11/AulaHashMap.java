package org.example.aula11;

import java.util.HashMap;
import java.util.Map;

public class AulaHashMap {

    static void main(String[] args) {

    /*..put("Ana", 28);
        .get("Ana");
        .getOrDefault("Zoe", 0);
        .containsKey("Ana"); -- pode pesquisar por chave. ele testa se tem a chave no codigo e informa true ou false
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */


        HashMap<String, String> emails =  new HashMap<>();


        // chaveeee        valorrr
        emails.put("Ane", "ane@gmail.com");
        emails.put("Paloma", "paloma@gmail.com");
        emails.put("posicao 2", "qualquer coisa");

        System.out.println(emails.get("Ane"));
        System.out.println("posicao 2");
        System.out.println("olá");

        System.out.println(emails.getOrDefault("", "Posição Inválida"));

        System.out.println(emails.keySet());
        System.out.println(emails.values());
        System.out.println(emails.containsKey("Ane"));




    }




}
