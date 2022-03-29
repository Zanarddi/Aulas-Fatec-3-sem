package lista01;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {
		// a variavel recebe o valor inserido pelo usuario no InputDialog
		float celcius = Float.parseFloat(JOptionPane.showInputDialog("Insira a temperatura em °C"));

		float farenheit = ((celcius * 9) / 5 + 32); // conversao da temperatura

		DecimalFormat df = new DecimalFormat("0.00");

		JOptionPane.showMessageDialog(null, df.format(celcius) + "°C = " + df.format(farenheit) + "°F");

	}

}
