package org.example.aula15;

public class ContBanc {

    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getNumeroConta() {
        return this.numeroConta;
    }

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
}

