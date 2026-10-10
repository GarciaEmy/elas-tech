package org.example.polimorf;

public class Pessoa {
    String nome;
    int idade;

    public void apresentar() {
        System.out.printf("Olá, meu nome é %s e tenho %d anos.\n", this.nome, this.idade);
    }
}