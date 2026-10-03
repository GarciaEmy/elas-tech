package org.example.aula10;

import java.util.Scanner;

public class AulaBranch {


    static void main(String[] args) {

        int num1;
        int num2;
        int resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();

        try {
            resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir");
        }

        sc.close();


    }
}
