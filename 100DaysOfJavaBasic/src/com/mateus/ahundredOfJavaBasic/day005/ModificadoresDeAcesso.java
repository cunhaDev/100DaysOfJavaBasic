package com.mateus.ahundredOfJavaBasic.day005;

/**
 *	Modificadores de Acesso em Java 
 */
public class ModificadoresDeAcesso {
	
	/** Pode ser acessada por qualquer classe/metodo */
	public String publica;
	
	/** Acesso restrito fora da classe, pode ser acessada pelos seus Get e Sets */
	private String privada;
	
	/** pode ser acessado por classes do mesmo pacote e tambem por suas filhas*/
	protected String protegida;
	
	/** pode ser acessado por classes do mesmo pacote */
	String modificadorDefault;

}
