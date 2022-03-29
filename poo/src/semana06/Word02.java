package semana06;

public class Word02 extends Thread{
	
	String texto = "Apostila de Python";
	
	public void run() {
		Impressora.imprimir(texto);
	}

}
