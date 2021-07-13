package com.mateus.ahundredOfJavaBasic.day007;

public class OperadoresLogicos {
	
	private final static int A = 2;
	private final static int B = 1;

	public static void main(String[] args) {
		
		System.out.println("A � Igual B ? " + ( A == B ));//Falso
		
		System.out.println("A � Diferente de B ? " + ( A != B ));//Verdadeiro
		
		System.out.println("A � Maior que B ? " + ( A > B ));//Verdadeiro
		
		System.out.println("A � Menor que B ? " + ( A < B ));//Falso
		
		System.out.println("A � Menor ou Igual a B ? " + ( A <= B ));//Falso
		
		System.out.println("A � Maior ou Igual a B ? " + ( A >= B ));//Verdadeiro
		
		System.out.println("A � Menor que B OU A � Diferente de B ? " + ( A < B || A != B ));//Verdadeiro
		
		System.out.println("A � Maior que B E B � Igual a 00 ? " + ( A > B && B == 0 ));//Falso
	}

}
