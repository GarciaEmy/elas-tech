package org.example.aula15;

public class MainContBanc {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        // 1. Mostrar o número da conta usando o getter
        System.out.println("Numero da conta: " + cb.getSaldo());

        // 2. Tentar mudar o número da conta (vai dar erro de compilação porque o setter não existe)
        // cb.setNumeroConta("999-Z");
    }
}

