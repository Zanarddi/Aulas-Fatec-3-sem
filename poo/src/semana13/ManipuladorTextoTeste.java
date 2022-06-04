package semana13;

public class ManipuladorTextoTeste {
	
	public static void main(String[] args) {
		ManipuladorTexto m = new ManipuladorTexto("Ola");
		m.print();
		m.append("Pessoal, como estão");
		m.imprimirCadaPalavra();
		m.print();
		m.substituirPalavra("Mundo", "Cara");
		m.print();
		m.deletarPalavra("Ola");
		m.print();
		m.imprimeFaixaDeCaracteres(5, 12);
	}
}