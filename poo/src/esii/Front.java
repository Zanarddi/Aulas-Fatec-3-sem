package esii;

import javax.swing.JOptionPane;

public class Front {

	public int a, b;

	public void digitar() {
		a = Integer.parseInt(JOptionPane.showInputDialog("valor 1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("valor 2"));
		System.out.println(Back.somar(a, b));
	}
}
