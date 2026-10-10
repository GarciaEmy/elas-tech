package org.example.aula14;

public class Dados {

    static void main(String[] args) {
       Aluna aluna = new Aluna();

       aluna.setNome("Maria");
       aluna.setIdade(20);

        aluna.apresentar();
        aluna.setCurso("Engenharia de Software");
        aluna.estudar();

        Professora professora = new Professora();
        professora.setNome("Flora");
        professora.setIdade(25);
        professora.setDisciplina("Java");

        System.out.println("------------");

        professora.apresentar();
        professora.lancarNota(aluna.getNome(), 10);


    }
}
