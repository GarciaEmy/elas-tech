package org.example.aula4;

public class Exercicio03 {

    static void main(String[] args) {

       int idade = 17;
       boolean temAutorizacao = true;

       if (idade >= 18 || temAutorizacao) {
           System.out.println("Pode entrar na festa");
       } else {
           System.out.println("Não pode entrar na festa");
       }

       if (idade >= 18 && temAutorizacao) {
           System.out.println("Pode entrar na festa");
       } else {
           System.out.println("Não pode entrar na festa");
       }


    }
}
