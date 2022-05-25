package semana11;

public class FuncionarioExcluirTeste {

	public static void main(String[] args) {
		FuncionarioDAO dao = new FuncionarioDAO();
		System.out.println(dao.excluir(10));
	}

}
