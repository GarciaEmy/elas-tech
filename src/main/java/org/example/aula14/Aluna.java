package org.example.aula14;

public class Aluna extends Pessoa {
    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void estudar() {
        // Usamos getNome() para pegar o nome que veio da classe mãe (Pessoa)
        System.out.println(getNome() + " está estudando " + curso + ".");
    }
}

