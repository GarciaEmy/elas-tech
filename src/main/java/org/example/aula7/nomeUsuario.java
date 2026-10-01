package org.example.aula7;

import java.util.Locale;
import java.util.Scanner;

public class nomeUsuario {

    static void main(String[] args) {

       /* String nome;

        Scanner nomeDoUsuario = new Scanner(System.in);
        System.out.println("Digite o seu nome completo: ");
        nome =  nomeDoUsuario.nextLine();
        System.out.println(nome.length());
        System.out.println(); */

        //======================================================


        /* String nome;

        Scanner nomeDoUsuario = new Scanner(System.in);
        System.out.println("Digite o seu nome completo: ");
        nome = nomeDoUsuario.nextLine();
        System.out.println(nome.toUpperCase());
        System.out.println();
        System.out.println(nome.toLowerCase(Locale.ROOT));
        System.out.println(); */

        //======================================================

        /* String nome;

        Scanner nomeDoUsuario = new Scanner(System.in);
        System.out.println("Digite o seu nome completo: ");
        nome = nomeDoUsuario.nextLine();
        System.out.println(nome.charAt(0));
        System.out.println(); */

        //======================================================

       /* String frase;
        String palavra;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga uma frase: ");
        frase = scanner.nextLine();

        System.out.println("Digite uma palavra");
        palavra = scanner.nextLine();

        System.out.println("A palavra aparece na palavra? ");
        System.out.println(frase.contains(palavra)); */

        //===========================================================

        String nomeMinusculo;
        String nomeMaiusculo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome minusculo:  ");
        nomeMinusculo = scanner.nextLine();

        System.out.println("Digite o nome maiusculo: ");
        nomeMaiusculo = scanner.nextLine();

        System.out.println(nomeMinusculo.equalsIgnoreCase(nomeMaiusculo));
        System.out.println();

    }
}


