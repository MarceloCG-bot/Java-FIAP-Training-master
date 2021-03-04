package com.java.fluxo;

import java.util.Scanner;

public class FluxoControle {

	public static void main(String[] args) {

		int idade = 0;
		
//		Scanner sc = new Scanner (System.in);
//		System.out.println("Digite o nome: ");
//		String nome = sc.nextLine();
		
//		System.out.println("Digite a idade: ");
//		idade = sc.nextInt();

		if (idade < 0)
			System.out.println("Idade inválida");

		if (idade >= 18 && idade < 70) {
			System.out.println("Maior idade");
		} else if (idade >= 70) {
			System.out.println("Terceira idade");
			if (idade >= 100) {
				System.out.println("Centenária");
			}

		} else {
			System.out.println("Menor idade");
		}


		int x = 11;

		if (x > 10) {
			System.out.println("X é maior do que 10");
		} else if (x == 10) {
			System.out.println("X é igual a 10");
		} else {
			System.out.println("X é menor do que 10");
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Informe o seu peso: ");
//		float peso = sc.nextFloat();
//		System.out.println("Peso informado: " + peso);
//		sc.close();
//		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int numero2 = sc.nextInt();
				
		int soma = numero1 + numero2;
				
		System.out.println("A soma é: " + soma);
				
		int resto = soma % 2;
		if (resto == 0){
			System.out.println("A soma é par");
		}else{
			System.out.println("A soma é ímpar");
		}
				
		sc.close();

	}

}
