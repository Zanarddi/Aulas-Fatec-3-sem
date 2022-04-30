package semana09;

public class Banana extends Fruta {

	public String tipo;

	@Override
	public void descascar() {
		super.descascar();
		System.out.println("Descascando a banana...");
	}

	@Override
	public void salvar() {
		super.salvar();
		String[] dados = {"Banana", ""+codigo, tipo, ""+valor};
		Texto.append(dados);
	}
}