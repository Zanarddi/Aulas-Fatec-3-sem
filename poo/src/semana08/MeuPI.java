package semana08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MeuPI extends JFrame {

	private JButton btOriginal;
	private BotaoPI btPersonal;

	public MeuPI() { // construtor
		setTitle("Projeto Interdisciplinar");
		setBounds(0, 0, 500, 300);
		setResizable(false);
		setLayout(null);
		btOriginal = new JButton("Original");
		btPersonal = new BotaoPI("Personal");
		btOriginal.setBounds(10, 10, 100, 25); // muda o tamarnho e a localizacao do botao
		btPersonal.setBounds(10, 50, 100, 25);

		add(btOriginal);
		add(btPersonal);

		definirEventos();
	}

	public void definirEventos() {
		btOriginal.addActionListener(new ActionListener() { // new a (ctrl+ space), isso gera o codigo abaixo
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btOriginal, "original");
			}
		});

		btPersonal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btPersonal, "personalizado");
			}
		});
	}

	public static void main(String[] args) {
		MeuPI pi = new MeuPI();
		pi.setVisible(true);
	}
}
