package semana11;

public class FuncionarioInclusaoTeste {

	public static void main(String[] args) {

		Funcionario f = new Funcionario(8, "Gustavo Silva", 7000);
		FuncionarioDAO dao = new FuncionarioDAO();
		
		for (int i=10;i<=1000;i++) {
			f.setCodigo(i);
			f.setNome("Funcionario "+i);
			f.setSalario(Math.random()*10000);
			dao.salvar(f);
			System.out.println(i);
		}
		
		

	}

}
