package org.example.polimorf;

public class MainProfessora extends Professora{
    static void main(String[] args) {
        Professora flora = new Professora();
        flora.nome = ("Flora");
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        flora.lancarNota("Ana", 9.5);
        flora.apresentar();
    }
}
