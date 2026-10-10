package org.example.aula14;

public class Professora extends Pessoa{
    private String disciplina;

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina; // O "this." é obrigatório aqui!
    }

    public void lancarNota(String aluna, double nota) {
        System.out.printf("%s lançou nota %.1f para %s%n", getNome(), nota, aluna);
    }

    @Override
    public void apresentar() {
        System.out.println("Oi, sou " + getNome() + " e ensino " + disciplina + ".");
    }

}
