package semana07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GuiCliente extends JPanel {
	private JButton btMostrar;
	private JLabel lbCodigo;
	private JLabel lbEmail;
	private JLabel lbNome;
	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTextField tfEmail;
	private Cliente cliente; //declaro o cliente

	public GuiCliente() {
		// construct components
		btMostrar = new JButton("Mostrar/salvar");
		lbCodigo = new JLabel("Codigo:");
		lbEmail = new JLabel("Email:");
		lbNome = new JLabel("Nome:");
		tfCodigo = new JTextField(5);
		tfNome = new JTextField(5);
		tfEmail = new JTextField(5);
		cliente = new Cliente();//alem dos elementos da tela, eu tambem iniciei oobjeto cliente

		// adjust size and set layout
		setPreferredSize(new Dimension(401, 239));
		setLayout(null);

		// add components
		add(btMostrar);
		add(lbCodigo);
		add(lbEmail);
		add(lbNome);
		add(tfCodigo);
		add(tfNome);
		add(tfEmail);

		// set component bounds (only needed by Absolute Positioning)
		btMostrar.setBounds(20, 190, 100, 20);
		lbCodigo.setBounds(30, 30, 100, 25);
		lbEmail.setBounds(30, 130, 100, 25);
		lbNome.setBounds(30, 80, 100, 25);
		tfCodigo.setBounds(80, 30, 100, 25);
		tfNome.setBounds(80, 80, 250, 25);
		tfEmail.setBounds(80, 130, 250, 25);

		btMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(btMostrar, "Ola"); // o btMostrar neste caso indica onde a caixa de mensagem vai aparecer
			
				cliente.setCodigo(Integer.parseInt(tfCodigo.getText()));
				cliente.setNome(tfNome.getText());
				cliente.setEmail(tfEmail.getText());
				
				JOptionPane.showMessageDialog(btMostrar, cliente.salvar());
								
				
				//JOptionPane.showInternalMessageDialog(btMostrar, cliente);
			}
		});
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("GuiCliente");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new GuiCliente());
		frame.pack();
		frame.setVisible(true);
	}
}
