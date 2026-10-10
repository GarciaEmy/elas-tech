package org.example.aula14;

public class Diretoria extends Gerente{

    public static void main(String[] args) {
        Diretora carla = new Diretora();
        carla.setNome("Carla");

        carla.baterPonto();

        carla.aprovarFerias("Ana");

        carla.definirMeta("Aumentar vendas em 20%");
    }
}

