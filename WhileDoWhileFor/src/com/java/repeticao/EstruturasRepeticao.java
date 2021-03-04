package com.java.repeticao;

import java.util.Scanner;

public class EstruturasRepeticao {
	
	public static void main(String[] args) {
		
//		int número = 0;
//		while (número < 10){
//		  número = número + 1;
//		  System.out.println(número);
		
//		int número = 0;
//		while (número < 10){
//		  número = número + 1;
//		  System.out.println(número);
		
//		Scanner sc = new Scanner(System.in);
//		
//		String opcão;
//		do {
//		  System.out.println("Digite um número: ");
//		  int n1 = sc.nextInt();
//		  System.out.println("Digite outro número: ");
//		  int n2 = sc.nextInt();
//		  int soma = n1 + n2;
//		  System.out.println("A soma é " + soma);
//		  System.out.println("Deseja somar outro número? (s/n)");
//		  opcão = sc.next();
//		} while(opcão.equals("s"));
//		sc.close();
		
//		for (int i=0; i<=10; i++){
//			  System.out.println(i);
//			}
		
//		Elabore um programa para ler 5 valores inteiros fornecidos pelo usuário e calcular a soma entre eles. 
//		Apresente o resultado final.
		
//		int[] valores = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<5;i++) {
			System.out.println("Digite um número: ");
			int n1 = sc.nextInt();
			int soma = n1 + (n1 * i);
			System.out.println("O valor da soma total é de: " + soma);
		}
		
// Elabora um programa para fazer a tabuada de um número fornecido pelo usuário, variando de 0 a 12, e mostre o resultado a cada iteração.
		
// Elabore um programa que calcule a sequência de Fibonacci até o 30º termo. A sequência segue o seguinte padrão 1,1,2,3,5,... n.
		
// Elabore um programa que leia o nome e o salário de n pessoas, o usuário deverá informar se deseja continuar a iteração. Ao final, apresente a quantidade de pessoas informadas e a média entre os salários.
		
		
	}

}
