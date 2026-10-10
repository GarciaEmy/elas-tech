package org.example.polimorf;

public class Estagiaria  extends Pessoa{
    public String setor;

    @Override
    public void apresentar() {
        System.out.printf("Olá, sou a estagiária %s, tenho %d anos e atuo no setor de %s.\n",
                this.nome, this.idade, this.setor);
    }
}
