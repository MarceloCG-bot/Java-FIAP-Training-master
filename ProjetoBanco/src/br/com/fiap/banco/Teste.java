package br.com.fiap.banco;

public class Teste {
	
	public static void main(String[] args) {
		
		Conta cc = new Conta();
		
//		Conta cc = null;
//		if (cc != null){
//			System.out.println(“Existe uma conta”);
//		}
		
//		cc.saldo = 1000;
//		cc.verificarSaldo();
//		
//		cc.depositar(100);
//		
//		double valor = cc.saldo; 
//		System.out.println(cc.saldo);
		
		cc.saldo = 50;
		cc.agencia = 123;
		cc.numero = 321;
		
		cc.depositar(100);
		
		System.out.println(cc.verificarSaldo());
		
		Conta poupanca = new Conta(111, 222, 1000);
		
		poupanca.retirar(50);
		
		System.out.println(poupanca.verificarSaldo());
		
		
	}

}
