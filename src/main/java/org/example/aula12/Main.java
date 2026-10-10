package org.example.aula12;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
      /*  Animal bidu = new Cachorro();
        bidu.emitirSom();

        Animal salem = new Gato();
        salem.emitirSom();
    } */


        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais){
            animal.emitirSom();
        }




    }
}
