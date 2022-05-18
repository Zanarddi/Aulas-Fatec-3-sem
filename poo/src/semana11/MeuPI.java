package semana11;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MeuPI extends JFrame implements PainelBotao, PainelCaixa{
	
	public MeuPI() {
		setBounds(0, 0, 300, 300);
		setLayout(new FlowLayout());
		bt.setText("Botão");
		tf.setText("Texto");
		add(bt);
		add(tf);
	}
	
	public static void main(String[] args) {
		MeuPI m = new MeuPI();
		m.setVisible(true);
	}

}
