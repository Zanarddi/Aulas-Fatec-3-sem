package semana13;

public class ManipuladorTexto {

	private String texto;

	public ManipuladorTexto(String texto) {
		this.texto = texto;
	}

	public void append(String texto) {
		this.texto += " " + texto;
	}

	public void substituirPalavra(String palavra, String nova) {
		texto = texto.replace(palavra, nova);
	}

	public void deletarPalavra(String palavra) {
		texto = texto.replace(palavra, "");
	}

	public void print() {
		System.out.println(texto);
	}

	public void imprimirCadaPalavra() {
		String[] palavras = texto.split(" ");
		for (String s : palavras) {
			System.out.println(s);
		}
	}

	public void imprimeFaixaDeCaracteres(int i, int f) {
		System.out.println(texto.substring(i, f));
	}

}
