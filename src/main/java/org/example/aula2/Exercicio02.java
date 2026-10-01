package org.example.aula2;

public class Exercicio02 {

    static void main(String[] args) {

        // 1 - Concatenação
        String nome = "Milica";
        String cidade = "São Paulo";
        int idade = 23;

        System.out.println("Meu nome é " + nome + ", moro na cidade de "
                + cidade + " e tenho " + idade + " anos.");

        // 2 - Produto
        String produto = "Caneca";
        double preco = 12.5;
        int quantidade = 4;
        double total = preco * quantidade;

        System.out.println("Comprei " + quantidade + " unidades de "
                + produto + " por R$ " + preco + " cada. Total: R$ " + total);

        // 3 - Soma
        int numero1 = 15;
        int numero2 = 4;
        int resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " e " + numero2
                + " é igual a " + resultado + ".");



        // segundos
        int segundos1 = 3785;
        int minutos1 = 3785 / 60;
        double convertidos = minutos1;

        System.out.println(convertidos);

        int segundos2 = 3785;
        int minutos2 = 3785 % 60;
        double restantes = minutos2;

        System.out.println(restantes);

    }

    }

