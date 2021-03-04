package br.com.fiap.tds;

public class OperadoresIncrementoDecremento {
	
	public static void main(String[] args) {
		
		int x = 10;
		x++;
		System.out.println("x = " + x);
		
		x--;
		System.out.println("x = " + x);
		
		int y = 10;
		
		++y;
		System.out.println("y = " + y);
		
		--y;
		System.out.println("y = " + y);
		
		int z = 10, w = 5, a = 5;
		
		z = w++;
		System.out.println("z = " + z);
		System.out.println("w = " + w);
		
		z = --a;
		System.out.println("z = " + z);
		System.out.println("a = " + a);
	}
	
}
