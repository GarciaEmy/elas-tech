package org.example.observer;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        RegistroEstoque registro = new RegistroEstoque();

        estoque.adicionarObservador(registro);

        estoque.setQuantidade(50);
        estoque.setQuantidade(35);
    }
}