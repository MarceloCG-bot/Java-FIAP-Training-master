package com.java.repeticao;

import java.util.Scanner;

public class EstruturasRepeticao {
	
	public static void main(String[] args) {
		
//		int n�mero = 0;
//		while (n�mero < 10){
//		  n�mero = n�mero + 1;
//		  System.out.println(n�mero);
		
//		int n�mero = 0;
//		while (n�mero < 10){
//		  n�mero = n�mero + 1;
//		  System.out.println(n�mero);
		
//		Scanner sc = new Scanner(System.in);
//		
//		String opc�o;
//		do {
//		  System.out.println("Digite um n�mero: ");
//		  int n1 = sc.nextInt();
//		  System.out.println("Digite outro n�mero: ");
//		  int n2 = sc.nextInt();
//		  int soma = n1 + n2;
//		  System.out.println("A soma � " + soma);
//		  System.out.println("Deseja somar outro n�mero? (s/n)");
//		  opc�o = sc.next();
//		} while(opc�o.equals("s"));
//		sc.close();
		
//		for (int i=0; i<=10; i++){
//			  System.out.println(i);
//			}
		
//		Elabore um programa para ler 5 valores inteiros fornecidos pelo usu�rio e calcular a soma entre eles. 
//		Apresente o resultado final.
		
//		int[] valores = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<5;i++) {
			System.out.println("Digite um n�mero: ");
			int n1 = sc.nextInt();
			int soma = n1 + (n1 * i);
			System.out.println("O valor da soma total � de: " + soma);
		}
		
// Elabora um programa para fazer a tabuada de um n�mero fornecido pelo usu�rio, variando de 0 a 12, e mostre o resultado a cada itera��o.
		
// Elabore um programa que calcule a sequ�ncia de Fibonacci at� o 30� termo. A sequ�ncia segue o seguinte padr�o 1,1,2,3,5,... n.
		
// Elabore um programa que leia o nome e o sal�rio de n pessoas, o usu�rio dever� informar se deseja continuar a itera��o. Ao final, apresente a quantidade de pessoas informadas e a m�dia entre os sal�rios.
		
		
	}

}
