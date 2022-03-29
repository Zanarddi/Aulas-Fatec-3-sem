package lista01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex09 {
	public static void main(String[] args) {
		
		// a variavel recebe o valor inserido pelo usuario no InputDialog
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura em metros"));

		double ideal = (72.7 * altura) - 58; // conversao da temperatura

		DecimalFormat df = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null, "Peso ideal = " + df.format(ideal) + "kg");


	}
}
