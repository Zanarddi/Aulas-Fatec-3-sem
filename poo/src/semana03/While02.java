package semana03;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class While02 {

	public static void main(String[] args) {
		
		double total = 0 ;
		while(true) {
			String s = JOptionPane.showInputDialog("Digite o preco do produto ou '0' para sair?");
			if(s == null) break;			
			float preco = Float.parseFloat(s);
			if(preco == 0) break;
			total += preco;
			
		}
		DecimalFormat df = new DecimalFormat("##.00");
		JOptionPane.showMessageDialog(null, "Total da compra :\n"+df.format(total));
		
	}
}
