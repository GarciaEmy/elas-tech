package org.example.aula11;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArrayList {

     public static void main(String[] args) {

       ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Emy");
        nomes.add("Angélica");
        nomes.add("Rafael");

        System.out.println("Lista de nomes: " + nomes);


         ArrayList<String> frutas = new ArrayList<>();

         frutas.add("Maça");
         frutas.add("Pera");
         frutas.add("Melancia");
         frutas.add("Jabuticaba");

         System.out.println("A primeira fruta é:  " + (frutas.get(0)));

         System.out.println(frutas.get(frutas.size() - 1));

         System.out.println(frutas.size());


         ArrayList<String> nome = new ArrayList<>();

         nome.add("Isabela");
         nome.add("Maria");
         nome.add("Izaque");
         nome.add("Gabriel");

         System.out.println("Antes: " + nome);

         nome.set(1, "Gabriel");
         nome.set(3, "Maria");

         System.out.println("Depois: " + nome);



         ArrayList<String> cidades = new ArrayList<>();

         cidades.add("São Paulo");
         cidades.add("Rio de Janeiro");
         cidades.add("Salvador");
         cidades.add("Pará");

         System.out.println(cidades.remove(1));
         System.out.println(cidades.size());



        ArrayList<String> sobrenome = new ArrayList<>();

        sobrenome.add("Garcia");
        sobrenome.add("Silva");
        sobrenome.add("Souza");
        sobrenome.add("Santana");
        sobrenome.add("Junior");
        sobrenome.add("Ramos");

         for (int i = 0; i < sobrenome.size(); i++) {
             System.out.println(i + ": " + sobrenome.get(i));
         }


         ArrayList<String> nomeUsuario = new ArrayList<>();

         nomeUsuario.add("Tiago");
         nomeUsuario.add("Claudia");
         nomeUsuario.add("Gustavo");
         nomeUsuario.add("Kaue");
         nomeUsuario.add("Nicoly");

         Scanner sc = new Scanner(System.in);
         System.out.println("Digite um nome para pesquisar: ");
         String pesquisado = sc.nextLine();

         if (nomeUsuario.contains(pesquisado)) {
             int posicao = nomeUsuario.indexOf(pesquisado);
             System.out.println("O nome " + pesquisado + " está na lista! Posição " + posicao);
         } else {
             System.out.println("O nome: " + pesquisado + " não foi encontrado.");
         }

         sc.close();
































































     }
}
