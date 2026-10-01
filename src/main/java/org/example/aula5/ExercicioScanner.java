package org.example.aula5;

import java.util.Scanner;

public class ExercicioScanner {

    static void main(String[] args) {

        String texto = "texto";
        int idade = 10;

        Scanner nomeDoScanner = new Scanner(System.in); // é para o usuário colocar a informação
        System.out.println("Digite o seu nome: ");
        texto = nomeDoScanner.nextLine();

        idade = nomeDoScanner.nextInt();
        System.out.println(idade);


    }

    }



