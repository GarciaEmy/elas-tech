package org.example.aula11;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AulaArrayDeque {
    static void main(String[] args) {

         Queue<String> fila = new LinkedList<>();

        fila.add("Ana");
        fila.add("Carlos");
        fila.add("Beatriz");

        System.out.println("Fila de pessoas: " + fila);

        System.out.println("Quantidade de pessoas na fila: " + fila.size());
        //==================================================================================================

        Queue<String> fila = new LinkedList<>();

        fila.addAll(List.of("Ana", "Carlos", "Beatriz"));

        String proximo = fila.peek();
        System.out.println("Próximo da fila (peek): " + proximo);

        System.out.println("Fila após o peek: " + fila);


        Queue<String> fila = new LinkedList<>();
        fila.addAll(List.of("Ana", "Carlos", "Beatriz"));

        String atendido = fila.poll();
        System.out.println("Pessoa atendida (poll): " + atendido);

        System.out.println("Fila após o poll: " + fila);


        Queue<String> fila = new LinkedList<>();
        fila.addAll(List.of("Ana", "Carlos", "Beatriz"));

        while (!fila.isEmpty()) {
            String atendido = fila.poll();
            System.out.println("Atendendo: " + atendido);
        }
        System.out.println("Fila vazia!");


        Queue<String> fila = new LinkedList<>();

        fila.addAll(List.of("Mariana", "Gabriel", "Lucas"));
        boolean temBia = fila.contains("Bia");
        System.out.println("Bia está na fila? " + temBia);

        boolean temZoe = fila.contains("Zoe");
        System.out.println("Zoe está na fila? " + temZoe);


        Queue<String> fila = new LinkedList<>();

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }

        fila.add("Fernanda");

        if (fila.isEmpty()) {
            System.out.println("Não tem ninguém na fila.");
        } else {
            System.out.println("Próximo: " + fila.peek());
        }

    }
}
