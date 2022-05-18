package esiiSequence;

public class Aluno {
	private String ra,nome,curso;
	
	public Aluno(String ra, String nome, String curso) {
		this.ra = ra;
		this.nome = nome;
		this.curso = curso;
	}

	public Aluno() {
	
	}
	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


}

