package com.java.operadores;

public class OperadorIgualdadeRelacionais {
	
	public static void main(String[] args) {
		
		int idade = 20;

//		boolean maioridade = idade > 18;
//		boolean maioridade = idade == 18;
//		boolean maioridade = idade != 18;
//		boolean maioridade = idade >= 18;
		
//		System.out.println(maioridade);
		
		boolean precisaVotar = idade >= 18 && idade < 70;
		System.out.println(precisaVotar);
		
		int nrAmarelo = 2, nrVermelho = 2;
		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
		System.out.println(suspenso);
		
		int x = 9, y = 11;
		boolean teste = x > 10 ^ y > 10;
		System.out.println(teste);
		
		boolean maiorIdade = !(idade >= 18);
		System.out.println(maiorIdade);
		
	}

}
