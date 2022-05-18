package semana11;

public class UsaVida {

	public static void main(String[] args) {
		
		Vida v = new Vida();
		Pessoa p = new Pessoa();
		v.viver(p);
		
		Fisio a = new ET();
		v.viver(a);
		
		Inseto i = new Inseto();
		v.viver(i);
	}
}
