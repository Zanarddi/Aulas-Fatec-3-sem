package semana10;

import java.util.ArrayList;
import java.util.List;

public class ListaEmpregado {

	public List<Empregado> lista = new ArrayList<Empregado>();

	public void add(Empregado e) {
		lista.add(e);
	}

	public void mostrar() {
		for (Empregado e : lista) {
			e.mostrarSubordinado();
		}
	}
}
