package org.example.aula2;

public class Exercicio04 {

    static void main (String[] args) {

        // 0 - Concatenação
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));

        // Na primeira linha o java entendeu como concatenação
        // porque o texto vem antes dos números
        // Por isso o resultado é 2 + 2 = 22.
        // Na segunda linha os parênteses fazem a soma primeiro
        // então o resultado é 2 + 2 = 4.

        // 1 - Números inteiros
        int a = 10;
        int b = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.println("A soma de " + a + " e " + b + " é " + soma);
        System.out.println("A subtração de " + a + " e " + b + " é " + subtracao);
        System.out.println("A multiplicação de " + a + " e " + b + " é " + multiplicacao);
        System.out.println("A divisão inteira de " + a + " e " + b + " é " + divisao);
        System.out.println("O resto da divisão de " + a + " e " + b + " é " + resto);


        // 2 - Números decimais
        double decimalA = 10;
        double decimalB = 3;

        double somaDecimal = decimalA + decimalB;
        double subtracaoDecimal = decimalA - decimalB;
        double multiplicacaoDecimal = decimalA * decimalB;
        double divisaoDecimal = decimalA / decimalB;
        double restoDecimal = decimalA % decimalB;

        System.out.println("A soma dos números decimais é " + somaDecimal);
        System.out.println("A subtração dos números decimais é " + subtracaoDecimal);
        System.out.println("A multiplicação dos números decimais é " + multiplicacaoDecimal);
        System.out.println("A divisão dos números decimais é " + divisaoDecimal);
        System.out.println("O resto dos números decimais é " + restoDecimal);



    }










}
