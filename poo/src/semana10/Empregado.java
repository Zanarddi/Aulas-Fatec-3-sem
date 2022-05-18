package semana10;

import java.util.List;

public class Empregado {
	
	public int numero;
	public String nome;
	public Empregado chefe;					//implementação do 1
	public List<Empregado> subordinados;	//implementação do *
	
	
	
	/**
	 * Construtor para criar um subordinado
	 * @param numero - numero do empregado
	 * @param nome - nome do empregado
	 * @param chefe - empregado chefe
	 */
	
	
	public Empregado(int numero, String nome, Empregado chefe) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.chefe = chefe;
	}
	
	
	
	/**
	 * Construtor para criar um chefe
	 * @param numero - numero do empregado
	 * @param nome - nome do empregado
	 * @param subordinados - lista com o nome dos empregados
	 */
	
	/*
	public Empregado(int numero, String nome, List<Empregado> subordinados) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.subordinados = subordinados;
	}

*/
	public void mostrarSubordinado() {
		System.out.print("[" + numero + ", " + nome);
		if(chefe != null) {
		System.out.print(", " + chefe.nome);
		}
		System.out.println("]");
	}
	
	public void mostrarChefe() {
		System.out.println(numero);
		System.out.println(nome);
		System.out.println(subordinados);
	}
	
}
