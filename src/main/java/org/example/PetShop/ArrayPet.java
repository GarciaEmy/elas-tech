package org.example.PetShop;


    public class ArrayPet {
        public static void main(String[] args) {
            Pet[] lista = new Pet[5];

            Pet mel = new Pet();
            mel.nome = "Mel";
            mel.especie = "Cachorro";
            mel.peso = 8.5;
            mel.porte = mel.definirPorte();

            lista[0] = mel;

            System.out.println("--- PETS CADASTRADOS ---");
            System.out.println(lista[0].nome + " (" + lista[0].especie + ") - " + lista[0].peso + " kg - Porte " + lista[0].porte);
        }
    }

