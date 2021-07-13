package com.mateus.ahundredOfJavaBasic.day007;

public class OperadoresLogicos {
	
	private final static int A = 2;
	private final static int B = 1;

	public static void main(String[] args) {
		
		System.out.println("A é Igual B ? " + ( A == B ));//Falso
		
		System.out.println("A é Diferente de B ? " + ( A != B ));//Verdadeiro
		
		System.out.println("A é Maior que B ? " + ( A > B ));//Verdadeiro
		
		System.out.println("A é Menor que B ? " + ( A < B ));//Falso
		
		System.out.println("A é Menor ou Igual a B ? " + ( A <= B ));//Falso
		
		System.out.println("A é Maior ou Igual a B ? " + ( A >= B ));//Verdadeiro
		
		System.out.println("A é Menor que B OU A é Diferente de B ? " + ( A < B || A != B ));//Verdadeiro
		
		System.out.println("A é Maior que B E B é Igual a 00 ? " + ( A > B && B == 0 ));//Falso
	}

}
