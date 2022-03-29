package semana06;

public class UsaPincel {

	public static void main(String[] args) {
		Pincel p1 = new Pincel(); // criando um objeto
		// p1.abrir();
		// p1.escrever();
		// p1.fechar();
		// p1.mostrar();

		p1.cor = "azul";
		p1.comprimento = 10;
		p1.preco = 4.50;
		p1.carregado = true;
		p1.mostrar();

		Pincel p2 = new Pincel(); // instanciando
		p2.cor = "preto";
		p2.comprimento = 10;
		p2.preco = 5.04;
		p2.carregado = false;
		p2.mostrar();

		Pincel p3; // declaracao
		p3 = new Pincel(); // criação / instanciação

		p1.cor = "Azul";
		p2.cor = "Amarelo";
		p3.cor = "Verde";
		System.out.println(p1.cor);
	}
}
