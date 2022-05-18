package semana11;

import java.util.List;

public class FuncionarioListarTeste {

	public static void main(String[] args) {
		FuncionarioDAO dao = new FuncionarioDAO();
		List<Funcionario> lista = 
				dao.get("select * from funcionarios where codigo > 990");
		
		for(Funcionario f:lista) {
			System.out.println(f);
		}
	}

}
