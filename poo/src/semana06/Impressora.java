package semana06;

public class Impressora {
	
	synchronized public static void imprimir(String texto) {
		for(int i = 0; i <= 10; i++) {
			System.out.println(texto + " - " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
