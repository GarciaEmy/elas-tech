package org.example.aula5;

import java.util.Scanner;

public class Lr02 {

    static void main(String[] args) {

        Scanner nomeDoScanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Ver camisas");
            System.out.println("2 - Ver calças");
            System.out.println("3 - Sair");
            System.out.println("Digite uma opção: ");

            opcao = nomeDoScanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolher ver camisas.");
                    break;

                case 2:
                    System.out.println("Você escolher ver calças");
                    break;

                case 3:
                    System.out.println("Você escolheu sair");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        }

            while (opcao != 3) ;

            nomeDoScanner.close();


        }

    }




