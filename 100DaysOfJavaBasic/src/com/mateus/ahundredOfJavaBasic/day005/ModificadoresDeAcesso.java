package com.mateus.ahundredOfJavaBasic.day005;

/**
 *	Modificadores de Acesso em Java 
 */
public class ModificadoresDeAcesso {
	
	/** Pode ser acessada por qualquer classe/metodo */
	public String publica;
	
	/** Acesso restrito fora da classe, pode ser acessada pelos seus Get e Sets */
	private String privada;
	
	/** Acesso restrito para as classes que n�o s�o Filhas */
	protected String protegida;
	
	/** Acesso publico */
	String modificadorDefault;

}
