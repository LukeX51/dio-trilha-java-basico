package com.br.Contas;

public class Conta {
    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar (double valor) {
        if (saldo <= valor) {
            System.out.println("Impossível realizar operação: saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado!");
            System.out.println("Saldo restante: R$" + saldo);
        }
    }

    public void depositar (double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Saldo atual: R$" + saldo);
    }
}
