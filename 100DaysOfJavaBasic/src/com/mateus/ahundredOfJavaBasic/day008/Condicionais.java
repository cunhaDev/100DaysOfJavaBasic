package com.mateus.ahundredOfJavaBasic.day008;

/** Condicional em Java - Teste Lógico */
public class Condicionais {

	private final static int A = 2;
	private final static int B = 4;
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/** If verifica primeiro se é Verdade */
		if (A > B) {
			System.out.println("A É MAIOR!");
		}
		/** se não for cai no Else */
		else {
			System.out.println("B É MAIOR!");
		}
		
		
		/** If Ternario segue a mesma Logica do If Comum, mudando apenas a Sintaxe */
		boolean ifTernatrio = true;
		System.out.println((ifTernatrio == true) ? "Eu Ja Conhecia" : "Eu Não Conhecia");


	}
}
