package semana09;

public class Abacaxi extends Fruta {

	public int tamanhoCoroa;
	
	@Override
	public void descascar() {
		super.descascar();
		System.out.println("Descascando o abacaxi...");
	}

	@Override
	public void salvar() {
		super.salvar();
		String[] dados = {"Abacaxi", ""+codigo, "" + tamanhoCoroa, ""+valor};
		Texto.append(dados);
	}
}