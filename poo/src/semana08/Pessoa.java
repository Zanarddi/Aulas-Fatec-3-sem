package semana08;

import javax.swing.JOptionPane;

public abstract class Pessoa { //a classe é abstrata, que serve de modelo para outras classes e nao permite gerar objetos

	private int codigo;
	private String nome;
	
	public void digitar() {
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo?"));
		nome = JOptionPane.showInputDialog("Nome?");
	}
	
	public void mostrar() {
		System.out.println(codigo);
		System.out.println(nome);
	}
}
