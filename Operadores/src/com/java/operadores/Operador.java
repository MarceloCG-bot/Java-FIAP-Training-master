package com.java.operadores;

public class Operador {
	
	public static void main(String[] args) {
		
//		int x = 5;
//		int y = 10;
//		int z = 15;
//		
//		int result = x + y;
//		System.out.println(result);
//		
//		result = x - y;
//		System.out.println(result);
//
//		result = x * y;
//		System.out.println(result);
//		
//		result = x / y;
//		System.out.println(result);
//		
//		result = x % y;
//		System.out.println(result);
//		
//		result = z - x + y * (x / y);
//		System.out.println(result);
//		
//		x = x + 15;
//		System.out.println(x);
//		
//		y += 15;
//		System.out.println(y);
//		
		int x = 9;
		int y = 2;
				
		int soma = x + y;
		int subtracao = x - y;
		int multiplicacao = x * y;
		int divisao = x / y;
		int resto = x % y;
				
		System.out.println("Resultado da adi��o: " + soma);
		System.out.println("Resultado da subtra��o: " + subtracao);
		System.out.println("Resultado da multiplicacao: " + multiplicacao);
		System.out.println("Resultado da divisao: " + divisao);
		System.out.println("Resultado do m�dulo: " + resto);
				
		x++;
		System.out.println("Resultado do incremento de x: " + x);
				
		y--;
		System.out.println("Resultado do decremento de y: " + y);
				
		x += 10;
		System.out.println("Resultado da atribui��o aditiva: " + x);
				
		y -= 10;
		System.out.println("Resultado da atribui��o subtrativa: " + y);
				
	}

}
