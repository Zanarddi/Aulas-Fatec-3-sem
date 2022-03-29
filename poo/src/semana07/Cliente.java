package semana07;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Cliente {
	private int codigo;
	private String nome, email;

	public void mostrar() {
		System.out.println(codigo);
		System.out.println(nome);
		System.out.println(email);
	}

	public String toString() {
		return ("[" + codigo + ", " + nome + ", " + email + "]");
	}

	// getters and setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * cria ou sobrescreve um arquivo .txt com as informacoes do cliente.
	 * 
	 * @return - mensagem de confirmacao da operacao
	 */
	public String salvar() {
		try {
			PrintWriter pw = new PrintWriter("c:/temp/" + codigo + ".txt");

			pw.println(codigo);
			pw.println(nome);
			pw.println(email);
			pw.close();
			return "Cliente armazenado com sucesso!";

		} catch (FileNotFoundException e) {
			return "Falha" + e;
		}

	}
}
