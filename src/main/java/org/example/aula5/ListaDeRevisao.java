package org.example.aula5;

import java.util.Scanner;

public class ListaDeRevisao {
    static void main(String[] args) {

        String lanche;
        int valor;


        Scanner nomeDoScanner = new Scanner(System.in);
        System.out.println("Digite o nome do seu lanche: ");
        lanche = nomeDoScanner.nextLine();

        System.out.println("Digite o valor do seu lanche: ");
        valor = nomeDoScanner.nextInt();

        if (valor > 30) {
            double desconto = valor * 0.05;
            double valorFinal = valor - desconto;
            System.out.printf("O lanche custa: %.2f\n ", valorFinal); //printf só concatena com virgula
        } else {
            System.out.printf("O lanche sem desconto custa: " + valor);
        }












    }




}
