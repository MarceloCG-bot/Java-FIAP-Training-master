package br.com.fiap.entify;

import exception.SaldoInsuficienteException;

////public class ContaCorrenteEspecial extends ContaCorrente {
////
////    private double limite;
////
////    @Override
////    public void sacar(double valor) throws SaldoInsuficienteException {
////        if (valor > saldo + limite){
////            throw new SaldoInsuficienteException();
////        }
////        saldo = saldo - valor;
////    }
////
////    @Override
////    public double verificarSaldo() {
////        return 0;
////    }
//}

public final class ContaCorrenteEspecial extends ContaCorrente implements transferivel {

    private double limite;

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo + limite) {
            throw new SaldoInsuficienteException();
        }
        saldo = saldo - valor;
    }

    @Override
    public double verificarSaldo() {
        return 0;
    }

    @Override
    public boolean realizarDoc(int nrBanco, int nrAgencia, int nrConta, double valor) {
        return false;
    }

    @Override
    public boolean realizarTed(int nrBanco, int nrAgencia, int nrConta, double valor) {
        return false;
    }
}
