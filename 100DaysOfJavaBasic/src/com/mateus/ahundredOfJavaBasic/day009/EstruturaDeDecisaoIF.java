package com.mateus.ahundredOfJavaBasic.day009;

public class EstruturaDeDecisaoIF {

	private static final String DiaSemana = "Quarta";

	public static void main(String[] args) {
		/** Estrutura de Decisão If Else*/

		if (DiaSemana.equals("Segunda")) {
			System.out.println("Hoje é Segunda Feira");
		} else if (DiaSemana.equals("Terca")) {
			System.out.println("Hoje é Terça Feira");
		} else if (DiaSemana.equals("Quarta")) {
			System.out.println("Hoje é Quarta Feira");
		} else if (DiaSemana.equals("Quinta")) {
			System.out.println("Hoje é Quinta Feira");
		} else if (DiaSemana.equals("Sexta")) {
			System.out.println("hoje é Sexta Feira");
		} else {
			System.out.println("Dia invalido!");
		}

	}

}
