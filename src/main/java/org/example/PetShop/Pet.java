package org.example.PetShop;

public class Pet {
        String nome;
        String especie;
        double peso;
        String porte;

        public String definirPorte() {
            if (peso < 10) {
                return "Pequeno";
            } else if (peso < 25) {
                return "Médio";
            } else {
                return "Grande";
            }

        }


    }






