package com.mateus.ahundredOfJavaBasic.day008;

/** Condicional em Java - Teste L�gico */
public class Condicionais {

	private final static int A = 2;
	private final static int B = 4;
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/** If verifica primeiro se � Verdade */
		if (A > B) {
			System.out.println("A � MAIOR!");
		}
		/** se n�o for cai no Else */
		else {
			System.out.println("B � MAIOR!");
		}
		
		
		/** If Ternario segue a mesma Logica do If Comum, mudando apenas a Sintaxe */
		boolean ifTernatrio = true;
		System.out.println((ifTernatrio == true) ? "Eu Ja Conhecia" : "Eu N�o Conhecia");


	}
}
