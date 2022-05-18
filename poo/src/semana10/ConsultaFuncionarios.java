package semana10;

import java.sql.SQLException;

import semana09.BD;

public class ConsultaFuncionarios {

	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		//String sql = "select * from funcionarios";
		String sql = "select f.codigo, f.nome, f.salario, d.nome from funcionarios as f, departamentos as d where d.codigo = f.departamento";

		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			bd.rs.next(); //estou na primeira linha
				
			while(bd.rs.next()) {
				System.out.println("[" + bd.rs.getInt(1) + ", " +
								bd.rs.getString(2) + ", " + 
								bd.rs.getString(3) + ", " +
								bd.rs.getString(4) + "]");
			}
			
		} catch (SQLException e) {

		} finally {
			bd.close();
		}
	}

}
