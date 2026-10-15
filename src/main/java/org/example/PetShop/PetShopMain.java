package org.example.PetShop;

import java.util.Scanner;

public class PetShopMain {
        public static void main(String[] args) {
            String nomeDado = "Mel";
            String especieDado = "Cachorro";
            double pesoDado = 8.5;

            System.out.println("=== FICHA DO PET ===");
            System.out.println("Nome: " + nomeDado);
            System.out.println("Espécie: " + especieDado);
            System.out.printf("Peso: ", pesoDado);


            String nome;
            String especie;
            double peso;

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite os dados do seu PET");
            System.out.println("Digite o nome: ");
            nome = sc.nextLine();
            System.out.println("Digite a espécie: ");
            especie = sc.nextLine();
            System.out.println("Digite o peso: ");
            peso = sc.nextDouble();

            if (peso <10) {
                System.out.println("Raça pequena");
            } else if (peso <25) {
                System.out.println("Raça Media");
            } else {
                System.out.println("Raça Grande");
            }

            System.out.println("\n=== FICHA DO PET ===");
            System.out.println("Nome: " + nome);
            System.out.println("Espécie: " + especie);
            System.out.printf("Peso: " + peso);

            sc.close();


        }

    }

