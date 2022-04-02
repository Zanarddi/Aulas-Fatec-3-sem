package semana08;

import javax.swing.JOptionPane;

public class Funcionario extends PessoaFisica {
	
	private double salario;
	
	public void digitar() {
		super.digitar(); //"importo" o metodo da minha superclasse
		salario = Double.parseDouble(JOptionPane.showInputDialog("Salário?"));
	}
	
	public void mostrar() {
		super.mostrar();//"importo" o metodo da minha superclasse
		System.out.println(salario);
	}

}
