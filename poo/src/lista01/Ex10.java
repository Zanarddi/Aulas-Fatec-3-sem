package lista01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex10 {
	
	public static void main(String[] args) {
		
		// a variavel recebe o valor inserido pelo usuario no InputDialog
		double iptu = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do IPTU"));
		double desconto = iptu * 0.05;
		double valorFinal = iptu - desconto;

		DecimalFormat df = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null, "Valor original = " + df.format(iptu) + "R$"
										  + "\nValor do desconto = " + df.format(desconto) + "R$"
										  + "\nValor final = " + df.format(valorFinal) + "R$");

	}

}
