package esii.composicao;

public class Casa {
	public int id;
	public String endereco;
	
	public Cozinha cozinha;
	public Sala sala;
	public Quarto[] quartos;
	
	public Casa() {
		cozinha = new Cozinha();
		sala = new Sala();
		quartos[0] = new Quarto();
		quartos[1] = new Quarto();
	}
}
