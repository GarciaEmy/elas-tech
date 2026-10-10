package org.example.aula12;

public class Moto implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("Moto ligou pipipi");
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }
}
