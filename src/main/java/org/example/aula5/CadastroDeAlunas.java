package org.example.aula5;

import java.util.Scanner;

public class CadastroDeAlunas {

    static void main(String[] args) {

        Scanner opcaoDoScanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 2) {
            System.out.println("Deseja iniciar? Pressione 1 continuar, 2 para sair");

            opcao = opcaoDoScanner.nextInt();

            switch (opcao) {
                case 1:
                    Aluna aluna = new Aluna();
                    System.out.println("Nota 1: ");
                    aluna.nota1 = opcaoDoScanner.nextDouble();

                    System.out.println("Nota 2:");
                    aluna.nota2 = opcaoDoScanner.nextDouble();

                    aluna.media = (aluna.nota1 + aluna.nota2) / 2;

                    opcaoDoScanner.nextLine();

                    System.out.println("Nome da Aluna: ");
                    aluna.nome = opcaoDoScanner.nextLine();
                    System.out.println(aluna.nome);

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                        System.out.println("Aprovada");
                    } else {
                        aluna.passou = false;
                        System.out.println("Reprovada");
                    }

                    System.out.println("O nome da aluna é: " + aluna.nome + " sua primeira nota é: " + aluna.nota1 + " e a sua segunda nota é:  " + aluna.nota2 + " e a sua média é: " + aluna.media + " aluna aprovada? " + aluna.passou);

                case 2:
                    System.out.println("Encerrando o sistema");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;


            }

        }

        opcaoDoScanner.close();
    }

}