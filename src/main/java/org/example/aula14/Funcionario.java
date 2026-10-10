package org.example.aula14;

public class Funcionario {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }
}