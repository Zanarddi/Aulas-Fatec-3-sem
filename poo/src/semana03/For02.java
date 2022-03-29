package semana03;

import javax.swing.JOptionPane;

public class For02 {
	public static void main(String[] args) throws InterruptedException {
/*
		for (int a = 0; a <= 50; a += 5) {
			System.out.print(a + " ");
			Thread.sleep(300);
		}
		System.out.println();
*/
		
		
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Tabuada?"));
		for(int a = 0; a <= 10; a++) {
			System.out.println(n + " x " + a + " = " + (n * a));
			Thread.sleep(500);
		}

	}

}
