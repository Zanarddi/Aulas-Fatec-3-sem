package semana09;

public class Laranja extends Fruta {

	boolean exportacao;

	@Override
	public void descascar() {
		super.descascar();
		System.out.println("Descascando a laranja...");
	}

	@Override
	public void salvar() {
		super.salvar();

		//operador ternario usado em exportacao, verificando o estado de exportacao
		String[] dados = { "Laranja", "" + codigo, exportacao ? "Exportacao" : "Nacional", "" + valor };
		Texto.append(dados);
	}
}