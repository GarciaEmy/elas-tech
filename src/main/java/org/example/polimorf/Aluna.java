package org.example.polimorf;

    public class Aluna extends Pessoa {
        String curso;

        @Override
        public void apresentar() {
            System.out.printf("Olá, sou a aluna %s, tenho %d anos e estudo %s.\n", this.nome, this.idade, this.curso);
        }
    }


