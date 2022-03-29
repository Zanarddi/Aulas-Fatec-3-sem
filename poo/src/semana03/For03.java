package semana03;

public class For03 {

	public static void main(String[] args) throws InterruptedException {
		
		for(char a = 'A';a<='z';a++) {
			System.out.println(a+" - " + (int)a);
			Thread.sleep(500);
		}
		
	}
}
