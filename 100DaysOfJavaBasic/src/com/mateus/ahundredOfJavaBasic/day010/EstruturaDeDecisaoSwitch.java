package com.mateus.ahundredOfJavaBasic.day010;

import java.util.Scanner;

public class EstruturaDeDecisaoSwitch {

	public static void main(String[] args) {

		Scanner diaEscolha = new Scanner(System.in);
		System.out.print("Informe um numero de 1 a 5: ");

		int opcao = diaEscolha.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Voc� escolheu Segunda Feira");
			break;
		case 2:
			System.out.println("Voc� escolheu Ter�a Feira");
			break;
		case 3:
			System.out.println("Voc� escolheu Quarta Feira");
			break;
		case 4:
			System.out.println("Voc� escolheu Quinta Feira");
			break;
		case 5:
			System.out.println("Voc� escolheu Sexta Feira");
			break;
		default:
			System.out.println("N�mero inv�lido");
		}
	}
}
