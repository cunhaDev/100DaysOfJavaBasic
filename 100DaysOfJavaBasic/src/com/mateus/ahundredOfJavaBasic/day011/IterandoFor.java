package com.mateus.ahundredOfJavaBasic.day011;

/** For � um La�o de Repeti��o, quando se diz Iterando For
 * quer dizer Percorrendo For este la�o. */
public class IterandoFor {

	public static void main(String[] args) {
		for(int i =0; i < 10; i++)
		{
			System.out.println("Percorrendo a Posi��o: " + i);
		}
	}
}

/**
 * For se Divide em 3 Partes:
 * 
 * Primeira: onde voc� atribui um valor a uma variavel
 * que inicia a itera��o, apenas uma vez.
 * 
 * Segunda: onde � feita a Valida��o Booleana, ocorre ate
 * a condi��o for falsa. neste caso Quando for Maior que 10.
 * 
 * Ter�eira: O que ocorre no final de cada Itera��o.
 * 
 * dentro do Escopo do For fica a a��o que ser� realizada.
 */