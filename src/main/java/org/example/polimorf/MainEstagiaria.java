package org.example.polimorf;

public class MainEstagiaria {

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

    public static void main(String[] args) {
        // 1. Criando a Aluna
        Aluna aluna = new Aluna();
        aluna.nome = "Beatriz";
        aluna.idade = 20;
        aluna.curso = "Engenharia de Software";

        // 2. Criando a Professora
        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 30;
        professora.disciplina = "Programação";

        // 3. Criando a Estagiária
        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Emy";
        estagiaria.idade = 23;
        estagiaria.setor = "Desenvolvimento";


        // Chamada 1: passando a Aluna
        mostrarFicha(aluna);

        // Chamada 2: passando a Professora
        mostrarFicha(professora);

        // Chamada 3: passando a Estagiária
        mostrarFicha(estagiaria);
    }
}