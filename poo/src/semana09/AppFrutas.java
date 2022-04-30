package semana09;

import javax.swing.JOptionPane;

public class AppFrutas {

	public static void main(String[] args) {

		String op = JOptionPane
				.showInputDialog("Qual fruta você quer descascar?\n" + "1. Banana\n2. Laranja\n3. Abacaxi");

		Fruta f = null;
		switch (op) {
		case "1":
			f = new Banana();
			break;
		case "2":
			f = new Laranja();
			break;
		case "3":
			f = new Abacaxi();
			break;
		}
		
		f.descascar();

		/*
		 * sem uso do polimorfismo Banana b = new Banana(); Laranja l = new Laranja();
		 * Abacaxi a = new Abacaxi();
		 * 
		 * b.descascar(); l.descascar(); a.descascar();
		 */
	}
}
