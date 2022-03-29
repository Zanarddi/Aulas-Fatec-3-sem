package semana06;

public class Pincel {

	// atributos (definem o que o objeto é (caracterisitcas))
	// definem o estado (valor) de um objeto
	public String cor;
	public double preco;
	public int comprimento;
	public boolean carregado;
	
	// metodos (defin o que pode ser feito com o objeto)
	// definem o comportamento dos objetos
	public void abrir() {
		System.out.println("A tampa foi aberta");
	}
	public void fechar() {
		System.out.println("A tampa foi fechada");
	}
	public void escrever() {
		System.out.println("Escrevendo...");
	}
	public void mostrar() {
		System.out.println(cor);
		System.out.println(preco);
		System.out.println(comprimento);
	}
}
