package esiiSequence;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GuiAluno extends JFrame {
	private JButton btGravar,btAbrir;
	private JTextField tfRa,tfNome,tfCurso;
	private JLabel lbRa, lbNome, lbCurso;
	private AlunoTxt alunoTxt = new AlunoTxt();
	
	public static void main(String[] args) {

		GuiAluno gui = new GuiAluno();
		gui.setVisible(true); 
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Espiao.writeln("Abriu a aplicação "+new Date());
	}
	
	public GuiAluno() {
		inicializarComponentes();
		definirEventos();
	}	

	private void inicializarComponentes() {
		setLayout(null);
		setBounds(0,0,450,200);
		btGravar = new JButton("Gravar");
		btAbrir = new JButton("Abrir");
		tfRa = new JTextField();
		tfNome = new JTextField();
		tfCurso = new JTextField();
		lbCurso = new JLabel("Curso:");
		lbRa = new JLabel("Matricula:");
		lbNome = new JLabel("Nome:");
		add(lbRa);
		lbRa.setBounds(10,10,100,25);
		add(tfRa);
		tfRa.setBounds(100,10,100,25);
		add(lbNome);
		lbNome.setBounds(10,45,100,25);
		add(tfNome);
		tfNome.setBounds(100,45,250,25);
		add(lbCurso);
		lbCurso.setBounds(10,80,150,25);
		add(tfCurso);
		tfCurso.setBounds(100,80,100,25);
		add(btGravar);
		btGravar.setBounds(10,125,100,25);
		add(btAbrir);
		btAbrir.setBounds(120,125,100,25);
	}
	
	private void definirEventos() {
		btGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = new Aluno();
				aluno.setRa(tfRa.getText());
				aluno.setNome(tfNome.getText());
				aluno.setCurso(tfCurso.getText());
				JOptionPane.showMessageDialog(btGravar, alunoTxt.gravar(aluno));
				Espiao.writeln("Gravou o aluno: "+aluno.getNome()+" " + new Date());
				tfRa.setText("");
				tfNome.setText("");
				tfCurso.setText("");
			}
		});			

		btAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Aluno aluno = alunoTxt.ler(tfRa.getText());
				if(aluno!=null){
					Espiao.writeln("Visualizou o aluno: "+aluno.getRa()+" - "+new Date());

					tfRa.setText(aluno.getRa());
					tfNome.setText(aluno.getNome());
					tfCurso.setText(aluno.getCurso());
				}
				else{
					JOptionPane.showMessageDialog(null, "Não encontrado");
				}
			}
		});			
	}
}