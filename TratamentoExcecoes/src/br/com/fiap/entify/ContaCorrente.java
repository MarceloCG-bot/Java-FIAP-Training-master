package br.com.fiap.entify;

import exception.SaldoInsuficienteException;

//public class ContaCorrente {
//    protected double saldo;
//
//    public void sacar(double valor) throws SaldoInsuficienteException {
//        if (valor > saldo) {
//            throw new SaldoInsuficienteException();
//        }
//        saldo = saldo - valor;
//    }
//}

public abstract class ContaCorrente {

    protected double saldo;
    public static final int BANCO = 33;

    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo = saldo - valor;
    }

    public abstract double verificarSaldo();
}
