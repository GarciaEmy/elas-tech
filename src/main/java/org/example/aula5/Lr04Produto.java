package org.example.aula5;

import java.util.Scanner;

public class Lr04Produto {

    static void main(String[] args) {

        String nome;
        double preco;

        Scanner nomeDoScanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            Produto produto = new Produto();

            System.out.println("Digite o nome do produto" + i );
            produto.nome = nomeDoScanner.nextLine();

            System.out.println("Digite o preço do produto" + i);
            produto.preco = nomeDoScanner.nextDouble();

            nomeDoScanner.nextLine();

            if (produto.preco > 100) {
                System.out.println("Produto caro. Valor:" + produto.preco);
            } else {
                System.out.println("Produto com preço acessível. Valor: " + produto.preco);
            }

        }

        nomeDoScanner.close();





    }

}
