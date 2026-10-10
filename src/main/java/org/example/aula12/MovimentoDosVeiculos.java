package org.example.aula12;

import java.util.ArrayList;
import java.util.List;

public class MovimentoDosVeiculos {
    static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add((new Carro()));
        veiculos.add((new Moto()));

        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
            System.out.println("---------");
        }

    }
}
