package semana02;

import javax.swing.JOptionPane;

public class Condicoes {

	public static void main(String[] args) {

		String n = JOptionPane.showInputDialog("Número do mês: ");
		int mes = Integer.parseInt(n); // "1" --> 1

		if (mes == 1)
			System.out.println("Jan");
		else if (mes == 2)
			System.out.println("Fev");
		else if (mes == 3)
			System.out.println("Mar");
		// ..até 12
		else
			System.out.println("Mês desconhecido!");

		/*
		 * if(n.equals("1")) System.out.println("Jan"); 
		 * if(n.equals("2")) System.out.println("Fev"); 
		 * if(n.equals("3")) System.out.println("Mar");
		 */

		String r = (mes == 1 ? "Jan" : mes == 2 ? "Fev" : mes == 3 ? "Mar" : "Des");
		System.out.println(r);
	}

}
