package org.example.polimorf;


public class Professora extends Pessoa {

    String disciplina;

    public void lancarNota(String aluna, double nota) {
        System.out.printf("%s lançou nota %.1f para %s\n", this.nome, nota, aluna);
    }

    @Override
    public void apresentar() {
        System.out.printf("Olá, sou a professora %s e dou a disciplina de %s.\n", this.nome, this.disciplina);
    }
}