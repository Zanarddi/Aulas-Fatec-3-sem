package semana06;

public class Windows {

	public static void main(String[] args) {
		//Impressora.imprimir("Hoje é sexta");
		
		Word01 w01 = new Word01(); //abre o documento
		Word02 w02 = new Word02();
		
		w01.start(); //incia a Thread (executa o run)
		w02.start(); //incia a Thread (executa o run)
	}
}