package semana14;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import semana09.BD;
import semana09.Texto;

public class AlunoExportar {
	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();

		List<String> linhas = new ArrayList<String>();

		String sql = "select * from alunos";
		String csvFile = "src/alunos.csv";

		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			linhas.add("ra;nome");

			while (bd.rs.next()) {
				linhas.add(bd.rs.getString(1) + ";" + bd.rs.getString(2));
				System.out.println(linhas.add(bd.rs.getString(1) + ";" + bd.rs.getString(2)));
			}
		} catch (SQLException e) {
			System.out.println("Erro: " + e);
		}
		System.out.println(Texto.gerarCSV(linhas, csvFile));
	}

}
