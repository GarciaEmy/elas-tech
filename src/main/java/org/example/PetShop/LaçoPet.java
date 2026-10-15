package org.example.PetShop;

import java.util.Scanner;

    public class LaçoPet {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Pet[] lista = new Pet[5];

            int opcao = -1;
            int total = 0;

            while (opcao != 0) {
                System.out.println("\n=== PETSHOP ===");
                System.out.println("1 - Cadastrar pet");
                System.out.println("2 - Listar pet");
                System.out.println("0 - Sair");
                System.out.print("Escolha: ");
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        Pet novoPet = new Pet();
                        System.out.print("Nome do pet: ");
                        novoPet.nome = sc.nextLine();
                        System.out.print("Espécie: ");
                        novoPet.especie = sc.nextLine();
                        System.out.print("Peso (kg): ");
                        novoPet.peso = sc.nextDouble();
                        sc.nextLine();

                        novoPet.porte = novoPet.definirPorte();

                        lista[total] = novoPet;
                        total++;
                        System.out.println("Pet cadastrado! Agora são " + total + " pet(s).");
                        break;

                    case 2:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado.");
                        } else {
                            System.out.println("\n--- PETS CADASTRADOS ---");
                            for (int i = 0; i < total; i++) {
                                System.out.println(lista[i].nome + " (" + lista[i].especie + ") - " + lista[i].peso + " kg - Porte " + lista[i].porte);
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Qual pet você procura? ");
                        String busca = sc.nextLine();
                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (lista[i].nome.equalsIgnoreCase(busca)) {
                                System.out.println("Encontrado: " + lista[i].nome + " (" + lista[i].especie + ") - " + lista[i].peso + " kg");
                                achou = true;
                            }
                        }

                        if (!achou) {
                            System.out.println("Pet não encontrado.");
                        }
                        break;
                    case 0:
                        System.out.println("Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
            sc.close();
        }
    }

