package semana03;

import javax.swing.JOptionPane;

public class Excecao02 {

	public static void main(String[] args) {

		String[] meses = { "jan", "fev" };

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
		System.out.println(meses[a]);
		int conta = 10 / a;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("OK " + a);

	}
}
