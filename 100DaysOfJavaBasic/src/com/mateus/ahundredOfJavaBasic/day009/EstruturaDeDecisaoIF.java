package com.mateus.ahundredOfJavaBasic.day009;

public class EstruturaDeDecisaoIF {

	private static final String DiaSemana = "Quarta";

	public static void main(String[] args) {
		/** Estrutura de Decis�o If Else*/

		if (DiaSemana.equals("Segunda")) {
			System.out.println("Hoje � Segunda Feira");
		} else if (DiaSemana.equals("Terca")) {
			System.out.println("Hoje � Ter�a Feira");
		} else if (DiaSemana.equals("Quarta")) {
			System.out.println("Hoje � Quarta Feira");
		} else if (DiaSemana.equals("Quinta")) {
			System.out.println("Hoje � Quinta Feira");
		} else if (DiaSemana.equals("Sexta")) {
			System.out.println("hoje � Sexta Feira");
		} else {
			System.out.println("Dia invalido!");
		}

	}

}
