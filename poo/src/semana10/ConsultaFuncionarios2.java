package semana10;

import java.util.List;

public class ConsultaFuncionarios2 {

	public static void main(String[] args) {
		List<Funcionario> lista = Funcionario.getList();
		
		for(Funcionario f : lista) {
			f.mostrar();
		}
	}
}
