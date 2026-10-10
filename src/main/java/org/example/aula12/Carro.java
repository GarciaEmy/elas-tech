package org.example.aula12;

import org.w3c.dom.ls.LSOutput;

public class Carro implements Veiculo{

    @Override
    public void ligar() {
        System.out.println("Carro ligou o motor ");
    }
    @Override
    public void acelerar() {
        System.out.println("Carro está acelerando agora");
    }
    }



