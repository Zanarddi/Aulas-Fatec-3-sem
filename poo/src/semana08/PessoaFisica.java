package semana08;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa {
	private String rg;
	private String cpf;

	// @Override indica que o metodo está sobrescrevendo a superclasse, impedindo
	// uma mascara diferente à do metodo original
	@Override
	public void digitar() {
		super.digitar(); // "importo" o metodo da minha superclasse
		rg = JOptionPane.showInputDialog("RG?");
		cpf = JOptionPane.showInputDialog("CPF?");
	}

	public void mostrar() {
		super.mostrar();// "importo" o metodo da minha superclasse
		System.out.println(rg);
		System.out.println(cpf);
	}
}
