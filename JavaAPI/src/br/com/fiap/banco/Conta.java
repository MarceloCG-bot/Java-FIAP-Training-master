package br.com.fiap.banco;
/**
 * Classe que abstrai uma Conta Banc�ria
 * @author Nicole Bidigaray
 * @version 1.0
 */
public class Conta {
	/**
	 * N�mero da conta
	 */
	private int numero;
	
	/**
	 * N�mero da Ag�ncia
	 */
	private int agencia;
	
	/**
	 * Saldo da Conta
	 */
	private double saldo;
	
	
	public Conta(){
		
	}
	
	public Conta(int numero, int agencia, double saldo){
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setSaldo(saldo);
	}
	
	void setSaldo(double saldo2) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor que ser� depositado
	 */
	public void depositar(double valor){
		this.setSaldo(this.getSaldo() + valor);
	}
	
	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor
	 */
	public void retirar(double valor){
		this.setSaldo(this.getSaldo() - valor);
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
}
