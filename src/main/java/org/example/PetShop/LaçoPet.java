package org.example.PetShop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LaçoPet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet[] lista = new Pet[5];
        ArrayDeque<String> filaBanho = new ArrayDeque<>();

        int opcao = -1;
        int total = 0;

        HashSet<String> conjuntos = new HashSet<>();

        while (opcao != 0) {
            System.out.println("\n=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pet");
            System.out.println("3 - Buscar pet");
            System.out.println("4 - Ver espécies");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo da fila");
            System.out.println("7 - Executar pacote de serviços num pet");
            System.out.println("8 - Testar fichas (Sobrecarga)");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do pet: ");
                        String nomePet = sc.nextLine();

                        System.out.print("Espécie: ");
                        String especiePet = sc.nextLine();

                        System.out.print("Peso (kg): ");
                        double pesoPet = sc.nextDouble();
                        sc.nextLine();

                        Pet novoPet;
                        if (especiePet.equalsIgnoreCase("Cachorro")) {
                            novoPet = new Cachorro();
                        } else if (especiePet.equalsIgnoreCase("Gato")) {
                            novoPet = new Gato();
                        } else {
                            novoPet = new Pet();
                        }

                        novoPet.nome = nomePet;
                        novoPet.especie = especiePet;
                        novoPet.peso = pesoPet;

                        conjuntos.add(novoPet.especie);

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
                                lista[i].emitirSom();
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

                    case 4:
                        System.out.println("\n--- ESPÉCIES CADASTRADAS ---");
                        for (String conj : conjuntos) {
                            System.out.println("- " + conj);
                        }
                        System.out.println("Total de espécies diferentes: " + conjuntos.size());
                        break;

                    case 5:
                        System.out.print("Nome do pet pra entrar na fila: ");
                        String nomeFila = sc.nextLine();
                        filaBanho.add(nomeFila);
                        System.out.println(nomeFila + " entrou na fila.");
                        System.out.println("Fila agora: " + filaBanho);
                        break;

                    case 6:
                        if (!filaBanho.isEmpty()) {
                            String proximo = filaBanho.poll();
                            System.out.println("Próximo da fila: " + proximo);
                            System.out.println("Atendendo " + proximo + "...");
                            System.out.println("Fila agora: " + filaBanho);
                        } else {
                            System.out.println("A fila está vazia.");
                        }
                        break;

                    case 7:
                        System.out.print("Nome do pet: ");
                        String petServico = sc.nextLine();

                        ArrayList<Servico> listaServicos = new ArrayList<>();
                        listaServicos.add(new Banho());
                        listaServicos.add(new Tosa());
                        listaServicos.add(new Consulta());

                        for (Servico s : listaServicos) {
                            s.executar(petServico);
                        }
                        break;

                    case 8:
                        if (total > 0) {
                            mostrarFicha(lista[0]);
                            System.out.println("---");
                            mostrarFicha(lista[0], "=== FICHA DO PET ===");
                        } else {
                            System.out.println("Cadastre pelo menos um pet primeiro.");
                        }
                        break;

                    case 0:
                        System.out.println("Até logo!");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Opção inválida. Digite novamente.");
                sc.nextLine();
            }
        }

        sc.close();
    } // Fim do método main


    static void mostrarFicha(Pet p) {
        System.out.println("Nome: " + p.nome);
    }

    static void mostrarFicha(Pet p, String titulo) {
        System.out.println(titulo);
        System.out.println("Nome: " + p.nome);
        System.out.println("Espécie: " + p.especie);
        System.out.printf("Peso: %.1f kg\n", p.peso);
        System.out.println("Porte: " + p.porte);
    }
}