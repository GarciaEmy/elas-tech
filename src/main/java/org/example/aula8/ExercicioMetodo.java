package org.example.aula8;

import java.util.Scanner;

public class ExercicioMetodo {

    // ESTE É O ÚNICO MAIN DO PROGRAMA!
    // Altere o nome dentro dele para rodar a atividade que você quiser testar.
    public static void main(String[] args) {

        // Atualmente vai rodar a Atividade 7.
        // Se quiser testar a 4, mude para: atividade4();
        atividade7();

    }

    // === ATIVIDADE 1: Mostrar Boas Vindas ===
    public static void atividade1() {
        System.out.println("Bem-vinda ao curso de JAVA!");
    }

    // === ATIVIDADE 2: Saudações ===
    public static void atividade2() {
        Utilidades.saudar(" Emy, ");
        Utilidades.saudar(" Ana, ");
        Utilidades.saudar(" Teo, ");
    }

    // === ATIVIDADE 3: Dobro do Número ===
    public static void atividade3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        int resultado = Utilidades.dobro(numero);
        System.out.println("O dobro é: " + resultado);
        sc.close();
    }

    // === ATIVIDADE 4: Calcular Média ===
    public static void atividade4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();

        double media = Utilidades.calcularMedia(n1, n2);
        System.out.println("A média é: " + media);
        sc.close();
    }

    // === ATIVIDADE 5: Maior de Idade ===
    public static void atividade5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (Utilidades.idade(idade)) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade. ");
        }
        sc.close();
    }

    // === ATIVIDADE 6: Sobrecarga de Soma ===
    public static void atividade6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo inteiro: ");
        int n2 = sc.nextInt();

        System.out.println("Soma dos dois: " + Utilidades.somar(n1, n2));

        System.out.print("Digite o terceiro inteiro: ");
        int n3 = sc.nextInt();

        System.out.print("Digite o primeiro decimal: ");
        double d1 = sc.nextDouble();

        System.out.print("Digite o segundo decimal: ");
        double d2 = sc.nextDouble();

        System.out.println("Soma dos decimais: " + Utilidades.somar(d1, d2));
        sc.close();
    }

    // === ATIVIDADE 7: Saudação Personalizada ===
    public static void atividade7() {
        Scanner sc = new Scanner(System.in);

        Utilidades.saudacao();

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        Utilidades.saudacao(nome);
        sc.close();
    }
}
