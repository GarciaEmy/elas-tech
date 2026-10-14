package org.example.aula15;

public class ContaBancaria {
    private String titular = "Ana";
    private double saldo;

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Titular inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    private boolean temSaldo(double valor) {
        return this.saldo >= valor;
    }

    private void registrarLog(String acao) {
        System.out.println("[LOG] " + this.titular + ": " + acao);
    }

    private void registrar(String acao) {
        System.out.println("[LOG] " + this.titular + ": " + acao);
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return;

        }
        this.saldo += valor;
        registrarLog("deposito de " + valor);
    }

    public void sacar(double valor) {
        if (!temSaldo(valor)) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        this.saldo -= valor;
        registrarLog("saque de " + valor);
    }



}