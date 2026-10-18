package org.example.PetShop;

// A palavra "implements" indica que Banho segue o contrato da interface Servico
public class Banho implements Servico {

    @Override
    public void executar(String nomePet) {


        System.out.println("Dando banho em " + nomePet + "...");
    }
}