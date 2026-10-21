package org.example.constructor;

public class Main {
    static void main(String[] args) {
        // a) Thor
        Agendamentos ag1 = new Agendamentos("Thor", "banho", "14h", true, true, false, "alérgico a shampoo", 0.10);

        // b) Luna
        Agendamentos ag2 = new Agendamentos("Luna", "tosa", "10h", false, false, false, "", 0.0);

        // c) Mel
        Agendamentos ag3 = new Agendamentos("Mel", "banho", "16h", false, false, true, "", 0.0);

        // Executar a impressão de cada um
        ag1.mostrar();
        ag2.mostrar();
        ag3.mostrar();
    }

    }

