package semana08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Produto implements Serializable {

	private int codigo;
	private String descricao;
	private double preco;

	
	public Produto() {
	}

	public Produto(int c, String d, double p) {
		this.setCodigo(c);
		this.setDescricao(d);
		this.setPreco(p);
	}

	public void mostrar() { // apresenta o estado atual
		System.out.println(codigo);
		System.out.println(descricao);
		System.out.println(preco);
	}

	// getters and setters

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	/**
	 * método que seta a descrição. Impede que ela seja menor que e, caso ela seja,
	 * deixa-a em branco
	 * 
	 * @param descricao - descricao do produto
	 */
	public void setDescricao(String descricao) {
		if (descricao.length() >= 5)
			this.descricao = descricao;
		else
			this.descricao = "";
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco >= 0)
			this.preco = preco;
	}

	public String toString() {
		return "[" + codigo + ", " + descricao + ", " + preco + "]";
	}
}
