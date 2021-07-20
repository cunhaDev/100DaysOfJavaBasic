package com.mateus.ahundredOfJavaBasic.day011;

/** For é um Laço de Repetição, quando se diz Iterando For
 * quer dizer Percorrendo For este laço. */
public class IterandoFor {

	public static void main(String[] args) {
		for(int i =0; i < 10; i++)
		{
			System.out.println("Percorrendo a Posição: " + i);
		}
	}
}

/**
 * For se Divide em 3 Partes:
 * 
 * Primeira: onde você atribui um valor a uma variavel
 * que inicia a iteração, apenas uma vez.
 * 
 * Segunda: onde é feita a Validação Booleana, ocorre ate
 * a condição for falsa. neste caso Quando for Maior que 10.
 * 
 * Terçeira: O que ocorre no final de cada Iteração.
 * 
 * dentro do Escopo do For fica a ação que será realizada.
 */