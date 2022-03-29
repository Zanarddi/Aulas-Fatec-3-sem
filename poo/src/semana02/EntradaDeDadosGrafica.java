package semana02;

import javax.swing.JOptionPane;

public class EntradaDeDadosGrafica {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		JOptionPane.showMessageDialog(null, nome);
	}

}
