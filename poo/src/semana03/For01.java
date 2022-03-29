package semana03;

public class For01 {

	public static void main(String[] args) throws InterruptedException {
		int i; 

		for (i = 0; i <= 10; i++) {
			System.out.print(i + " ");
			Thread.sleep(100);
		}
		System.out.println("\n" + i);

		for (i = 10; i >= 0; i--) {
			System.out.print(i + " ");
			Thread.sleep(100);
		}
		System.out.println("\n" + i);

	}

}
