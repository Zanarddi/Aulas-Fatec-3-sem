package semana03;

public class ForComMetodo {

	public static void imprimeConta(int i) throws InterruptedException {
		for(int j = 0; j<=10; j++) {
			System.out.println(i+" x "+ j+" = "+i*j);
			Thread.sleep(100);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		//int n = Integer.parseInt(JOptionPane.showInputDialog("tabuada?"));
		//imprimeConta(n);
		for(int i = 0; i<=10;i++) {
			imprimeConta(i);
		}
	}
	
}
