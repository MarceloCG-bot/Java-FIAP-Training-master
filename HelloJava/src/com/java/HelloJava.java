package com.java;

public class HelloJava {

	public static void main(String[] args) {
		
//		int idade = 10;
//		double preco = 10.5;
//		char sexo = 'M';
//		boolean temFilhos = true;
//		
//		System.out.println(idade);
//		System.out.println(preco);
//		System.out.println(sexo);
//		System.out.println(temFilhos);
		
		int x = 10;   // declara��o de uma vari�vel do tipo int
		double d = x; // vari�vel double recebe um tipo int
		long l = x;   // vari�vel long recebe um tipo int
		float f = x;  // vari�vel float recebe um tipo int (aten��o)
		short s = 20; // declara��o de uma vari�vel do tipo short
		x = s;        // vari�vel int recebe um tipo short
		
		double valorDouble = 9.99;
		int valorInt = (int) valorDouble;
		
		System.out.println(valorInt);
		

	}

}
