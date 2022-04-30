package semana09;

public class FrutaToTxt {
	public static void main(String[] args) {

		Banana b = new Banana();
		b.codigo = 1;
		b.tipo = "Nanica";
		b.valor = 3.99;
		b.salvar();
		
		Abacaxi a = new Abacaxi();
		a.codigo = 1;
		a.tamanhoCoroa = 10;
		a.valor = 3.99;
		a.salvar();
		
		Laranja l = new Laranja();
		l.codigo = 1;
		l.exportacao = false;
		l.valor = 3.99;
		l.salvar();

	}
}
