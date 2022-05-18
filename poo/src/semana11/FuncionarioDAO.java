package semana11;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import semana09.BD;

public class FuncionarioDAO {

	private String sql,men;
	private BD bd;
	
	public FuncionarioDAO() {
		bd = new BD();
	}
	
	/**
	 * Realiza a inclusão de um funcionario
	 * @param f - um objeto do tipo Funcionario
	 * @return - uma mensagem com o resultado da operação
	 */
	public String salvar(Funcionario f) {
		sql = "insert into funcionarios (codigo,nome,salario) values (?,?,?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,f.getCodigo());
			bd.st.setString(2,f.getNome());
			bd.st.setDouble(3,f.getSalario());
			bd.st.executeUpdate();
			men = "Funcionario inserido com sucesso!";
		}
		catch(SQLException erro) {
			sql = "update funcionarios set nome=?, salario =? where codigo = ?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(3,f.getCodigo());
				bd.st.setString(1,f.getNome());
				bd.st.setDouble(2,f.getSalario());
				bd.st.executeUpdate();
				men = "Funcionario atualizado com sucesso"; 
			}
			catch(SQLException e) {
				men = "Falha "+erro; 
			}
		}
		finally {
			bd.close();
		}
		return men;
	}
	
	public String excluir(int codigo) {
		sql = "delete funcionarios where codigo = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,codigo);
			if(bd.st.executeUpdate()==1)
				men = "Funcionario excluído com sucesso!";
			else
				men = "Funcionario não foi encontrado!";
		}
		catch(SQLException erro) {
			men = "Falha na exclusão "+erro; 
		}
		finally {
			bd.close();
		}
		return men;
	}
	
	public List<Funcionario> get(String sql){
		List<Funcionario> lista = new ArrayList<Funcionario>();
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			while(bd.rs.next()) {
				lista.add(new Funcionario(
							bd.rs.getInt(1),
							bd.rs.getString(2), 
							bd.rs.getDouble(3))
				);
			}
		}
		catch(SQLException erro) {
			lista = null;
			System.out.println(erro);
		}
		finally {
			bd.close();
		}
		return lista;
	}
}
