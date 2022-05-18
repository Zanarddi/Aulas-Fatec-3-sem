package semana10;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import semana09.BD;

public class GradeCidadeTela extends JFrame {
	private static final long serialVersionUID = 1L;

	private JButton btLocalizar, b2;
	private JTextField tfLocalizar;
	private JPanel panel;
	private JTable table;
	private DefaultTableModel model; // linhas da tabela
	private BD bd;

	public static void main(String args[]) {
		JFrame janela = new GradeCidadeTela();
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	public GradeCidadeTela() {
		bd = new BD();
		bd.getConnection();

		setTitle("Tabela de Cidades");
		setBounds(200, 200, 600, 300);
		setResizable(false);
		getContentPane().setBackground(Color.white);
		btLocalizar = new JButton("Localizar");
		tfLocalizar = new JTextField(10);
		b2 = new JButton("Sair");
		panel = new JPanel();
		panel.setBackground(new Color(230, 230, 230));
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.add(tfLocalizar);
		panel.add(btLocalizar);
		panel.add(b2);
		add(panel, BorderLayout.NORTH);

		model = MyTableModel.getModel(bd, "select cidade.codigo, cidade.nome, estado.nome as estado from cidade, estado");
		table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		add(sp, BorderLayout.CENTER);

		tfLocalizar.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
				try {
					model =MyTableModel.getModel(bd, "select cidade.codigo, cidade.nome, estado.nome as estado from cidade, estado"
							+ "	where estado.codigo = cidade.estado and cidade.nome like '" + tfLocalizar.getText()+"%'");
					table.setModel(model);
				} catch (Exception erro) {
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
			}
		});

	}
}