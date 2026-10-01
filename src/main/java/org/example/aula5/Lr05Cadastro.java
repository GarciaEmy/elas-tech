package org.example.aula5;

import java.util.Scanner;

public class Lr05Cadastro {

    static void main(String[] args) {

        String nome;
        int anoDeNascimento;

        Scanner nomeDoScanner = new Scanner(System.in);
        System.out.println("Digite o seu nome completo");
        nome = nomeDoScanner.nextLine();

        Scanner anoDoScanner = new Scanner (System.in);
        System.out.println("Digite o seu ano de nascimento");
        anoDeNascimento = anoDoScanner.nextInt();

        System.out.println("Nome completo: " + nome + "e nasceu em: " + anoDeNascimento);


    }
}


