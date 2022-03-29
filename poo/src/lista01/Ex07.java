package lista01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {

		// a variavel recebe o valor inserido pelo usuario no InputDialog
		float farenheit = Float.parseFloat(JOptionPane.showInputDialog("Insira a temperatura em °F"));

		float celcius = (5 * (farenheit - 32) / 9); // conversao da temperatura

		DecimalFormat df = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null, farenheit + "°F = " + df.format(celcius) + "°C");

	}
}
