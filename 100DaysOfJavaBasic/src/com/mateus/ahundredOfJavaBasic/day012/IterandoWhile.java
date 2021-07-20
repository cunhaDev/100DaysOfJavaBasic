package com.mateus.ahundredOfJavaBasic.day012;

/** While � um La�o de Repeti��o que Recebe Uma Express�o Booleana.
 * Ou Seja, enquanto for Verdade ele Executa, e quando ficar falso
 * ele finaliza o La�o e sai do Loop. */
public class IterandoWhile {

	private static int A = 0;
	
	public static void main(String[] args) {	

		/**
		 * Aqui estamos Dizendo: ENQUANTO FOR MENOR QUE ... FA�A ...*/
		while( A < 10)
		{
			A++;
			System.out.println("Percorrendo a Posi��o: " + A);
		}
		System.out.println("Saiu do Loop porque Chegou a 10");
	}
}

/**
 * Neste Caso Definimos 0 para A e falamos, Enquanto A for Menor Que 10,
 * Aumente Mais Um e Imprima no Console.
 * */
