package semana02;

import javax.swing.JOptionPane;

public class Condicoes2 {

	public static void main(String[] args) {

		String n = JOptionPane.showInputDialog("N�mero do m�s: ");
		int mes = Integer.parseInt(n); // "1" --> 1
		String s = "";
		switch (mes){
			case 1 : s = "Jan"; break;
			case 2 : s = "Fev"; break;
			case 3 : s = "Mar"; break;
			default: s = "Desconhecido";
		}
		System.out.println(s);
	}

}
